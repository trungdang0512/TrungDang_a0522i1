import { Injectable } from '@angular/core';
import {Contract} from "../model/contract";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  contracts: Contract[] =[];

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Contract[]> {
    return this.httpClient.get<Contract[]>('http://localhost:3000/contract');
  }

  saveContract(event: any): Observable<any> {
    return this.httpClient.post<any>('http://localhost:3000/contract', event);
  }

  findContractById(value: number): Observable<Contract> {
    return this.httpClient.get<Contract>('http://localhost:3000/contract/' + value);
  }

  editContract(value: number, contract: Contract): Observable<any> {
    return this.httpClient.put<any>('http://localhost:3000/contract/' + value, contract);
  }

  deleteContract(value: number): Observable<any> {
    return this.httpClient.delete<any>('http://localhost:3000/contract/' + value);
  }
}
