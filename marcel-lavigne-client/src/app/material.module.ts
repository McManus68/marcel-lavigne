import { NgModule, Component, ViewEncapsulation } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule, MatCheckboxModule, MatFormFieldModule, MatInputModule, MatDatepickerModule, MatOptionModule, MatSelectModule } from '@angular/material';
import { MatNativeDateModule, MatIconModule, MatIconRegistry, MatExpansionModule, MatSliderModule, MatSlideToggleModule, MatCardModule } from '@angular/material';
import { MatButtonToggleModule, MatToolbarModule, MatStepperModule, MatSnackBarModule } from '@angular/material';
import {FloatLabelType, MAT_LABEL_GLOBAL_OPTIONS, LabelOptions} from '@angular/material/core';
import { DomSanitizer } from '@angular/platform-browser';

@NgModule({
  imports: [
    FormsModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatFormFieldModule,
    MatIconModule,
    MatInputModule,
    MatDatepickerModule,
    MatOptionModule,
    MatNativeDateModule,
    MatSelectModule,
    HttpClientModule,
    MatExpansionModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatCardModule,
    MatButtonToggleModule,
    MatToolbarModule,
    MatStepperModule,
    MatSnackBarModule
  ],
  exports: [
    FormsModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatFormFieldModule,
    MatIconModule,
    MatInputModule,
    MatDatepickerModule,
    MatOptionModule,
    MatNativeDateModule,
    MatSelectModule,
    HttpClientModule,
    MatExpansionModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatCardModule,
    MatButtonToggleModule,
    MatToolbarModule,
    MatStepperModule,
    MatSnackBarModule
  ],
  providers: [
    {provide: MAT_LABEL_GLOBAL_OPTIONS, useValue: {float: 'always'}}
  ]
})

export class MaterialModule {
  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) {
    /** Custom Icons  **/
    var iconList = ['beer', 'champaign', 'logo', 'logo-grey', 'pin', 'promotion', 'visit', 'wine'];
    iconList.forEach((iconName) => {
     iconRegistry.addSvgIcon(
        iconName,
        sanitizer.bypassSecurityTrustResourceUrl('assets/icons/' + iconName + '.svg'));
    });
    /** Registrer Font Awesome Icons **/
    iconRegistry.registerFontClassAlias('fontawesome', 'fa');
  }
}
