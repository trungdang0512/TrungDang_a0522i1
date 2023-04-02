import { Component, OnInit } from '@angular/core';
import {Client} from "../../../model/client";
import {ClientServiceService} from "../../../service/client-service.service";

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {
  clients: Client[] = [];

  constructor(private clientService: ClientServiceService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.clients = this.clientService.getAll();
  }

}
