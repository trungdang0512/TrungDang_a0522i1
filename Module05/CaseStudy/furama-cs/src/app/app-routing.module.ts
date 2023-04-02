import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HeaderComponent} from "./component/template/header/header.component";
import {ClientComponent} from "./component/client-managerment/client/client.component";
import {ClientCreateComponent} from "./component/client-managerment/client-create/client-create.component";
import {ClientEditComponent} from "./component/client-managerment/client-edit/client-edit.component";
import {ServiceListComponent} from "./component/service-managerment/service-list/service-list.component";
import {ServiceCreateComponent} from "./component/service-managerment/service-create/service-create.component";
import {ServiceEditComponent} from "./component/service-managerment/service-edit/service-edit.component";
import {ContractListComponent} from "./component/contract-managerment/contract-list/contract-list.component";
import {ContractCreateComponent} from "./component/contract-managerment/contract-create/contract-create.component";


const routes: Routes = [
  {
    path: 'client',
    component: ClientComponent
  },{
    path:'client/create',
    component: ClientCreateComponent
  }, {
    path: 'client/edit/:id',
    component: ClientEditComponent
  },{
    path: 'service',
    component: ServiceListComponent
  },{
    path: 'service/create',
    component: ServiceCreateComponent
  },{
    path: 'service/edit/:id',
    component: ServiceEditComponent
  },{
    path: 'contract',
    component: ContractListComponent
  },{
    path: 'contract/create',
    component: ContractCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
