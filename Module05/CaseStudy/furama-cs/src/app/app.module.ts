import { BrowserModule } from '@angular/platform-browser';
import {CUSTOM_ELEMENTS_SCHEMA, NgModule, NO_ERRORS_SCHEMA} from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientComponent } from './component/client-managerment/client/client.component';
import { HeaderComponent } from './component/template/header/header.component';
import { FooterComponent } from './component/template/footer/footer.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { ClientCreateComponent } from './component/client-managerment/client-create/client-create.component';
import { ServiceListComponent } from './component/service-managerment/service-list/service-list.component';
import { ServiceCreateComponent } from './component/service-managerment/service-create/service-create.component';
import { ContractListComponent } from './component/contract-managerment/contract-list/contract-list.component';
import { ContractCreateComponent } from './component/contract-managerment/contract-create/contract-create.component';
import { ClientEditComponent } from './component/client-managerment/client-edit/client-edit.component';
import { ServiceEditComponent } from './component/service-managerment/service-edit/service-edit.component';
import {HttpClientModule} from "@angular/common/http";
import { ContractEditComponent } from './component/contract-managerment/contract-edit/contract-edit.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {Ng2OrderModule} from "ng2-order-pipe";
import {NgxPaginationModule} from "ngx-pagination";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatIconModule} from "@angular/material/icon";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatSlideToggleModule} from "@angular/material/slide-toggle";
import {MatInputModule} from "@angular/material/input";
import {MatRadioModule} from "@angular/material/radio";
import {MatSelectModule} from "@angular/material/select";
import {MatNativeDateModule} from "@angular/material/core";
import {MatButtonModule} from "@angular/material/button";
import {MatTableModule} from "@angular/material/table";
import {MatProgressBarModule} from "@angular/material/progress-bar";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatSortModule} from "@angular/material/sort";
import {MatCardModule} from "@angular/material/card";
import {MatListModule} from "@angular/material/list";
import {MatChipsModule} from "@angular/material/chips";
import {Ng2SearchPipeModule} from "ng2-search-filter";

@NgModule({
  declarations: [
    AppComponent,
    ClientComponent,
    HeaderComponent,
    FooterComponent,
    ClientCreateComponent,
    ServiceListComponent,
    ServiceCreateComponent,
    ContractListComponent,
    ContractCreateComponent,
    ClientEditComponent,
    ServiceEditComponent,
    ContractEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    Ng2OrderModule,
    NgxPaginationModule,
    MatIconModule,
    MatSlideToggleModule,
    MatFormFieldModule,
    MatInputModule,
    MatRadioModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatButtonModule,
    MatTableModule,
    MatPaginatorModule,
    MatSortModule,
    MatCardModule,
    MatProgressBarModule,
    MatListModule,
    MatChipsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA]
})
export class AppModule { }
