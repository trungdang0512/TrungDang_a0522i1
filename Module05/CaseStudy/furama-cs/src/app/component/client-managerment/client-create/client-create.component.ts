import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Client} from "../../../model/client";
import {FormControl, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";


@Component({
  selector: 'app-client-create',
  templateUrl: './client-create.component.html',
  styleUrls: ['./client-create.component.css']
})
export class ClientCreateComponent implements OnInit {
  client : Client ={};

  createClientForm: FormGroup;

  constructor(private route: Router) {
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
    }
  }
}
