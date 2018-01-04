import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material';

@Component({
  selector: 'ml-create-event',
  templateUrl: './create-event.component.html',
  styleUrls: ['./create-event.component.scss']
})
export class CreateEventComponent {


  picture: String;
  hours;
  minutes;
  isLinear = false;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  event = {};

  constructor(private _formBuilder: FormBuilder, public snackBar: MatSnackBar, public router: Router) {
    this.picture =  '../../assets/images/events/no_file.png';
  }

    ngOnInit() {
      this.firstFormGroup = this._formBuilder.group({
        firstCtrl: ['', Validators.required]
      });
      this.secondFormGroup = this._formBuilder.group({
        secondCtrl: ['', Validators.required]
      });

      this.hours = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23];
      this.minutes = [0,15,30,45];
    }

    changePicture(event) {
      this.picture = "../../assets/images/events/event_5.jpg";
    }

    create = () => {
      this.snackBar.open('Evènement crée avec succés', 'Succés', {
        duration: 3000 });
      this.router.navigateByUrl('home');
    }
}
