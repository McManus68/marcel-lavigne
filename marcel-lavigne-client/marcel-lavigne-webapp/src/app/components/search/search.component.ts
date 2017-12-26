import { Component, Input } from '@angular/core';
import { trigger, state, style, animate, transition } from '@angular/animations';

@Component({
  selector: 'ml-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss'],
  animations: [
      // Each unique animation requires its own trigger. The first argument of the trigger function is the name
      trigger('rotatedState', [
                            state('default', style({ transform: 'rotate(0)' })),
                            state('rotated', style({ transform: 'rotate(-180deg)' })),
                            transition('rotated => default', animate('300ms ease-out')),
                            transition('default => rotated', animate('300ms ease-in'))
     ])
   ]
})
export class SearchComponent {

  state: string = 'default';

  rotate() {
    this.state = (this.state === 'default' ? 'rotated' : 'default');
  }
}
