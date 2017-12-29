import { Component } from '@angular/core';

@Component({
  selector: 'ml-create-event',
  templateUrl: './create-event.component.html',
  styleUrls: ['./create-event.component.scss']
})
export class CreateEventComponent {

  hours;
  minutes;

  constructor() {
    this.hours = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23];
    this.minutes = [0,15,30,45];
  }
}
