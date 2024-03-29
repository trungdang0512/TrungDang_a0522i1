import { BrowserModule } from '@angular/platform-browser';
import {CUSTOM_ELEMENTS_SCHEMA, NgModule, NO_ERRORS_SCHEMA} from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ThProgressBarComponent } from './component/ss05/th-progress-bar/th-progress-bar.component';
import { BtAngularRatingBarComponent } from './component/ss05/bt-angular-rating-bar/bt-angular-rating-bar.component';
import { ThNameCardComponent } from './component/ss05/th-name-card/th-name-card.component';
import { BtCountdownTimerComponent } from './component/ss05/bt-countdown-timer/bt-countdown-timer.component';
import { ThTodoAppComponent } from './component/ss06/th-todo-app/th-todo-app.component';
import {ReactiveFormsModule} from '@angular/forms';
import { BtRegisterFormComponent } from './component/ss06/bt-register-form/bt-register-form.component';
import { BtRegisterAcclistComponent } from './component/ss06/bt-register-acclist/bt-register-acclist.component';
import { BtLoginComponent } from './component/ss06/bt-login/bt-login.component';
import { ThTimelinesComponent } from './component/ss07/th-timelines/th-timelines.component';
import { ThYoutubePlaylistComponent } from './component/ss07/th-youtube-playlist/th-youtube-playlist.component';
import { YoutubePlayerComponent } from './component/ss07/th-youtube-playlist/youtube-player/youtube-player.component';
import { ProductListComponent } from './component/ss07/product-managerment/product/product-list/product-list.component';
import { ProductCreateComponent } from './component/ss07/product-managerment/product/product-create/product-create.component';
import { ProductUpdateComponent } from './component/ss07/product-managerment/product/product-update/product-update.component';
import { DictionaryComponent } from './component/ss07/bt-dictionary/dictionary-detail/dictionary.component';
import { DictionaryPageComponent } from './component/ss07/bt-dictionary/dictionary-page/dictionary-page.component';
import {HttpClientModule} from '@angular/common/http';
import {ProductRoutingModule} from './component/ss07/product-managerment/product/product-routing.module';
import {ShareModule} from './component/ss07/product-managerment/share/share.module';
import {CategoryListComponent} from './component/ss07/product-managerment/category/category-list/category-list.component';
import {CategoryModule} from './component/ss07/product-managerment/category/category.module';
import {CategoryRoutingModule} from './component/ss07/product-managerment/category/category-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    ThProgressBarComponent,
    BtAngularRatingBarComponent,
    ThNameCardComponent,
    BtCountdownTimerComponent,
    ThTodoAppComponent,
    BtRegisterFormComponent,
    BtRegisterAcclistComponent,
    BtLoginComponent,
    ThTimelinesComponent,
    ThYoutubePlaylistComponent,
    YoutubePlayerComponent,
    DictionaryComponent,
    DictionaryPageComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FontAwesomeModule,
        ProductRoutingModule,
        ReactiveFormsModule,
        HttpClientModule,
        ShareModule
    ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA]
})
export class AppModule { }
