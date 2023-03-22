import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Client} from "../../../model/client";
import {FormControl, FormGroup} from "@angular/forms";


@Component({
  selector: 'app-client-create',
  templateUrl: './client-create.component.html',
  styleUrls: ['./client-create.component.css']
})
export class ClientCreateComponent implements OnInit {
  client : Client ={};
  @Output()
  eventEmit = new EventEmitter();

  createClientForm: FormGroup;

  constructor() {
    this.createClientForm = new FormGroup({
      id: new FormControl(),
      nameClient: new FormControl(),
      idClient: new FormControl(),
      typeClient: new FormControl(),
      dateOfBirth: new FormControl(),
      phone: new FormControl(),
      email: new FormControl(),
      address: new FormControl()
    })
  }

  ngOnInit(): void {
  }


  addNewClient() {
    console.log(this.createClientForm)
    if (this.createClientForm.valid){
      console.log(this.createClientForm.value)
      this.eventEmit.emit(this.createClientForm.value);
    }
  }
}
