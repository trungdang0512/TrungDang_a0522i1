import { Component, OnInit } from '@angular/core';
import {Client} from "../../../model/client";

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {
  idNum = 0;
  client : Client ={};
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
  clientInfo: Client;

  constructor() { }

  ngOnInit(): void {
  }

  getInfo(temp: Client){
    this.clientInfo= temp;
  }

  addNewClient(event: any): void{
    this.clients.push(event);
  }

}
