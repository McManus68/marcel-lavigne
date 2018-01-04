import { Component, Input, OnInit } from '@angular/core';
import { EventService } from '../../services/event.service';
import { Event } from '../../model/Event';

@Component({
  selector: 'ml-grid-events',
  templateUrl: './grid-events.component.html',
  styleUrls: ['./grid-events.component.scss']
})
export class GridEventsComponent implements OnInit {

  events: Event[] = [];

  constructor(private eventService: EventService) {}

  ngOnInit() {
    this.getEvents();    
  }

  getEvents(): void {
    this.events = this.eventService.getMockedEvents();
  }
}
