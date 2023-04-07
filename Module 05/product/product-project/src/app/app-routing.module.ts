import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from "./component/product/product-list/product-list.component";
import {ProductCreateComponent} from "./component/product/product-create/product-create.component";
import {CategoryListComponent} from "./component/category/category-list/category-list.component";
import {CategoryCreateComponent} from "./component/category/category-create/category-create.component";
import {CategoryEditComponent} from "./component/category/category-edit/category-edit.component";
import {ProductEditComponent} from "./component/product/product-edit/product-edit.component";


let ProductUpdateComponent;
const routes: Routes = [
  {
    path: 'product/list',
    component: ProductListComponent
  },{
    path: 'product/create',
    component: ProductCreateComponent
  },{
    path: 'product/edit/:id',
    component: ProductEditComponent
  },{
    path: 'product/delete/:id',
    component: ProductListComponent
  },{
  path: 'category/list',
    component: CategoryListComponent
  }, {
    path: 'category/create',
    component: CategoryCreateComponent
  },
  {
    path: 'category/edit/:id',
    component: CategoryEditComponent
  },
  { path: 'category/delete/:id',
    component: CategoryListComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
