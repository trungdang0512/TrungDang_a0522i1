import { Injectable } from '@angular/core';
import {Category} from '../component/ss07/product-managerment/category/category';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../component/ss07/product-managerment/product/product';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  categories: Category[] = [];

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Category[]> {
    return this.httpClient.get<Category[]>('http://localhost:3000/category');
  }

  saveCategory(event: any): Observable<any> {
    return this.httpClient.post<any>('http://localhost:3000/category', event);
  }

  findById(value: number): Observable<Product> {
    return this.httpClient.get<Product>('http://localhost:3000/category/' + value);
  }

  updateCategory(value: number, category: Category): Observable<any> {
    return this.httpClient.put<any>('http://localhost:3000/category/' + value, category);
  }

  deleteCategory(value: number): Observable<any> {
    return this.httpClient.delete<any>('http://localhost:3000/category/' + value);
  }

}
