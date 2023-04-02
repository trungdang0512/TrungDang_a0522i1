import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from "./component/product/product-list/product-list.component";
import {ProductCreateComponent} from "./component/product/product-create/product-create.component";
import {CategoryListComponent} from "./component/category/category-list/category-list.component";
import {CategoryCreateComponent} from "./component/category/category-create/category-create.component";
import {CategoryEditComponent} from "./component/category/category-edit/category-edit.component";


let ProductUpdateComponent;
const routes: Routes = [
  {
    path: 'product',
    loadChildren: () => import('./component/product/product.module').then(module => module.ProductModule)
  },{
    path: 'category',
    loadChildren: () => import('./component/category/category.module').then(module => module.CategoryModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
