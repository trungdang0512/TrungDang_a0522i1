import { Injectable } from '@angular/core';
import {Client} from "../model/client";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ClientServiceService {
  clients : Client[] = [];
  page : number = 1;

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Client[]> {
    return this.httpClient.get<Client[]>('http://localhost:3000/client?_' + this.page);
  }

  saveClient(event: any): Observable<any> {
    return this.httpClient.post<any>('http://localhost:3000/client', event);
  }

  findClientById(value: number): Observable<Client> {
    return this.httpClient.get<Client>('http://localhost:3000/client/' + value);
  }

  editProduct(value: number, client: Client): Observable<any> {
    return this.httpClient.put<any>('http://localhost:3000/client/' + value, client);
  }


  deleteProduct(value: number): Observable<any> {
    return this.httpClient.delete<any>('http://localhost:3000/client/' + value);
  }

  findByName(name : string ) : Observable<Client[]>{
    return this.httpClient.get<Client[]>('http://localhost:3000/client?q=' + name);
  }
}
