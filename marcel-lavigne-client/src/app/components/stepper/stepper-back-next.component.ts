import { Component } from '@angular/core';

@Component({
  selector: 'ml-stepper-back-next',
  template: `<div class="row mb-2 mt-2">
              <div class="col text-left">
                <button mat-fab matStepperPrevious color="primary">
                  <mat-icon>arrow_backward</mat-icon>
                </button>
              </div>
              <div class="col text-right">
                <button mat-fab matStepperNext color="primary">
                  <mat-icon>arrow_forward</mat-icon>
                </button>
              </div>
            </div>`,
  styleUrls: ['./stepper.component.scss']

})
export class StepperBackNextComponent {
}
