import { Component } from '@angular/core';

@Component({
  selector: 'ml-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent {
  locales = ['Français', 'Anglais'];
  currencies = ['EUR', 'DOLLAR'];
}
