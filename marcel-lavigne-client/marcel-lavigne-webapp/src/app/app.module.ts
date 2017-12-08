import { LOCALE_ID, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import { HttpModule } from '@angular/http';
import { routing } from './app.routing';

/********************** I18N **********************/
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
registerLocaleData(localeFr, 'fr');
/********************** MARCEL LAVIGNE SERVICES **********************/
import { AuthGuard } from './guards/auth.guard';
import { AuthenticationService } from './services/authentication.service';
import { UserService } from './services/user.service';

/********************** MARCEL LAVIGNE VIEWS **********************/
import { AppComponent }  from './app.component';
import { LoginComponent } from './views/login/login.component';
import { HomeComponent } from './views/home/home.component';
import { HeaderComponent }  from './views/header/header.component';

/********************** CUSTOM COMPONENTS **********************/
import { ButtonIconComponent }  from './components/button-icon/button-icon.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    HeaderComponent,
    ButtonIconComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpModule,
    routing
  ],
  providers: [
    AuthGuard,
    AuthenticationService,
    UserService,
    {provide: LOCALE_ID, useValue: 'fr' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
