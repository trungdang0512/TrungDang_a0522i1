import { BrowserModule } from '@angular/platform-browser';
import {CUSTOM_ELEMENTS_SCHEMA, NgModule, NO_ERRORS_SCHEMA} from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ThProgressBarComponent } from './component/ss05/th-progress-bar/th-progress-bar.component';
import { BtAngularRatingBarComponent } from './component/ss05/bt-angular-rating-bar/bt-angular-rating-bar.component';
import { ThNameCardComponent } from './component/ss05/th-name-card/th-name-card.component';
import { BtCountdownTimerComponent } from './component/ss05/bt-countdown-timer/bt-countdown-timer.component';

@NgModule({
  declarations: [
    AppComponent,
    ThProgressBarComponent,
    BtAngularRatingBarComponent,
    ThNameCardComponent,
    BtCountdownTimerComponent
  ],
  imports: [
    BrowserModule,
    FontAwesomeModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA]
})
export class AppModule { }
