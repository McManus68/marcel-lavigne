import { Component, Input } from '@angular/core';

@Component({
  selector: 'ml-carousel-events',
  templateUrl: './carousel-events.component.html',
  styleUrls: ['./carousel-events.component.scss']
})
export class CarouselEventsComponent {
  images = ['event_1.jpg', 'event_2.jpg', 'event_3.jpg', 'event_4.jpg'];
}
