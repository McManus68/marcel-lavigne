import { Component } from '@angular/core';

@Component({
  selector: 'ml-stepper-next',
  template: `<div class="d-flex mb-2 mt-2 justify-content-end">
              <button mat-fab matStepperNext color="primary">
                <mat-icon>arrow_forward</mat-icon>
              </button>
            </div>`,
  styleUrls: ['./stepper.component.scss']

})
export class StepperNextComponent {
  
}
