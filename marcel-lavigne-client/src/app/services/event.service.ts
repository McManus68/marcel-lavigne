import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { catchError, map, tap } from 'rxjs/operators';

import { Event } from '../model/Event';
import { MockedService } from '../services/mocked.service';
//import { MessageService } from './message.service';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EventService {

  private eventsUrl = 'api/events';  // URL to web api

  constructor(private http: HttpClient, /*private messageService: MessageService*/) { }

  /** GET events from the server */
  getEvents (): Observable<Event[]> {
    return this.http.get<Event[]>(this.eventsUrl)
      .pipe(
        tap(events => this.log(`fetched events`)),
        catchError(this.handleError('getEvents', []))
      );
  }

  /** GET hero by id. Return `undefined` when id not found */
  getEventNo404<Data>(id: number): Observable<Event> {
    const url = `${this.eventsUrl}/?id=${id}`;
    return this.http.get<Event[]>(url)
      .pipe(
        map(events => events[0]), // returns a {0|1} element array
        tap(h => {
          const outcome = h ? `fetched` : `did not find`;
          this.log(`${outcome} hero id=${id}`);
        }),
        catchError(this.handleError<Event>(`getEvent id=${id}`))
      );
  }

  /** GET hero by id. Will 404 if id not found */
  getEvent(id: number): Observable<Event> {
    const url = `${this.eventsUrl}/${id}`;
    return this.http.get<Event>(url).pipe(
      tap(_ => this.log(`fetched hero id=${id}`)),
      catchError(this.handleError<Event>(`getEvent id=${id}`))
    );
  }

  /* GET events whose name contains search term */
  searchEvents(term: string): Observable<Event[]> {
    if (!term.trim()) {
      // if not search term, return empty hero array.
      return of([]);
    }
    return this.http.get<Event[]>(`api/events/?name=${term}`).pipe(
      tap(_ => this.log(`found events matching "${term}"`)),
      catchError(this.handleError<Event[]>('searchEvents', []))
    );
  }

  //////// Save methods //////////

  /** POST: add a new hero to the server */
  addEvent (hero: Event): Observable<Event> {
    return this.http.post<Event>(this.eventsUrl, hero, httpOptions).pipe(
      tap((hero: Event) => this.log(`added hero w/ id=${hero.id}`)),
      catchError(this.handleError<Event>('addEvent'))
    );
  }

  /** DELETE: delete the hero from the server */
  deleteEvent (hero: Event | number): Observable<Event> {
    const id = typeof hero === 'number' ? hero : hero.id;
    const url = `${this.eventsUrl}/${id}`;

    return this.http.delete<Event>(url, httpOptions).pipe(
      tap(_ => this.log(`deleted hero id=${id}`)),
      catchError(this.handleError<Event>('deleteEvent'))
    );
  }

  /** PUT: update the hero on the server */
  updateEvent (hero: Event): Observable<any> {
    return this.http.put(this.eventsUrl, hero, httpOptions).pipe(
      tap(_ => this.log(`updated hero id=${hero.id}`)),
      catchError(this.handleError<any>('updateEvent'))
    );
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  /** Log a EventService message with the MessageService */
  private log(message: string) {
    //this.messageService.add('EventService: ' + message);
  }
}
