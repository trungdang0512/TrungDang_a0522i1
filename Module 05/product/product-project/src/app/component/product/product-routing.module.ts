import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from "./product-list/product-list.component";
import {ProductCreateComponent} from "./product-create/product-create.component";
import {CategoryEditComponent} from "../category/category-edit/category-edit.component";


const routes: Routes = [
  {
    path: 'list',
    component: ProductListComponent
  },{
    path: 'create',
    component: ProductCreateComponent
  },{
    path: 'edit/:id',
    component: CategoryEditComponent
  },{
    path: 'delete/:id',
    component: ProductListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
