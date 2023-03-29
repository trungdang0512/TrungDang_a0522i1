import { Injectable } from '@angular/core';
import {Client} from "../model/client";

@Injectable({
  providedIn: 'root'
})
export class ClientServiceService {
  clients : Client[] = [
    {id: 1,
      nameClient: "Trung Dang",
      idClient: 123456789,
      typeClient: "Gold",
      dateOfBirth: "05/12/1992",
      phone: 793897616,
      email: "vantrung0512@gmail.com",
      address: "Huynh Thuc Khang, Da Nang"
    },
    {id: 2,
      nameClient: "Trung 123",
      idClient: 1234567892,
      typeClient: "Platinum",
      dateOfBirth: "05/12/1992",
      phone: 7923897616,
      email: "123123123@gmail.com",
      address: "Huynh Thuc Khang, Da Nang"
    }
  ]
  constructor() { }

  getAll(){
    return this.clients;
  }

  saveClient(client){
    return this.clients.push(client);
  }

  findById(value: number){
    return this.clients.find(client => client.id === value);
  }

  editClient(client) {
    for (let i = 0; i < this.clients.length; i++) {
      if (client.id === this.clients[i].id) {
        this.clients[i] = client;
      }
    }
  }
}
