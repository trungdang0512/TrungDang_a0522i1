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
    ClientEditComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FontAwesomeModule,
        FormsModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA]
})
export class AppModule { }
