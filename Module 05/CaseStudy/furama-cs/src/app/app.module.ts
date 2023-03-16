import { BrowserModule } from '@angular/platform-browser';
import {CUSTOM_ELEMENTS_SCHEMA, NgModule, NO_ERRORS_SCHEMA} from '@angular/core';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClientComponent } from './component/client/client.component';
import { EmployeeComponent } from './component/employee/employee.component';
import { ServiceComponent } from './component/service/service.component';
import { ContractComponent } from './component/contract/contract.component';
import { ContractDetailComponent } from './component/contract-detail/contract-detail.component';
import { HeaderComponent } from './component/template/header/header.component';
import { FooterComponent } from './component/template/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    ClientComponent,
    EmployeeComponent,
    ServiceComponent,
    ContractComponent,
    ContractDetailComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA]
})
export class AppModule { }
