import { Component, Input } from '@angular/core';
import { Event } from '../../model/Event';

@Component({
  selector: 'ml-card-event',
  templateUrl: './card-event.component.html',
  styleUrls: ['./card-event.component.scss']
})
export class CardEventComponent  {

  @Input() event: Event;

}
