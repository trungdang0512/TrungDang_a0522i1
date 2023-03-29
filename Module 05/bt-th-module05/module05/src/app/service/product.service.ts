import { Injectable } from '@angular/core';
import {Product} from "../component/ss07/product-managerment/product";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[] = [];

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>('http://localhost:3000/product');
  }

  saveProduct(event: any): Observable<any>{
    return this.httpClient.post<any>('http://localhost:3000/product', event);
  }

  findProductById(value: number): Observable<Product>{
    return this.httpClient.get<Product>('http://localhost:3000/product/' + value);
  }

  editProduct(value: number, product: Product): Observable<any> {
   return this.httpClient.put<any>('http://localhost:3000/product/' + value, product);
  }


  deleteProduct(value: number): Observable<any>{
    return this.httpClient.delete<any>('http://localhost:3000/product/' + value);
  }
}
