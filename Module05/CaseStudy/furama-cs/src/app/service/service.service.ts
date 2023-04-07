import { Injectable } from '@angular/core';
import {Service} from "../model/service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  services: Service[] = [];

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Service[]> {
    return this.httpClient.get<Service[]>('http://localhost:3000/service');
  }

  saveService(event: any): Observable<any> {
    return this.httpClient.post<any>('http://localhost:3000/service', event);
  }

  findServiceById(value: number): Observable<Service> {
    return this.httpClient.get<Service>('http://localhost:3000/service/' + value);
  }

  editService(value: number, service: Service): Observable<any> {
    return this.httpClient.put<any>('http://localhost:3000/service/' + value, service);
  }

  deleteService(value: number): Observable<any> {
    return this.httpClient.delete<any>('http://localhost:3000/service/' + value);
  }
}
