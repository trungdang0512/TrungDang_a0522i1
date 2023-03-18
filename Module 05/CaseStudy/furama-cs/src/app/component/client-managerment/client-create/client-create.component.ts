import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Client} from "../../../model/client";


@Component({
  selector: 'app-client-create',
  templateUrl: './client-create.component.html',
  styleUrls: ['./client-create.component.css']
})
export class ClientCreateComponent implements OnInit {
  client : Client ={};
  @Output()
  eventEmit = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }


  addNewClient() {
    this.eventEmit.emit(this.client);
    this.client = {};
  }
}
