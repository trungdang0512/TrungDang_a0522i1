import {Component, Input, OnChanges, OnInit, SimpleChange, SimpleChanges} from '@angular/core';
import {Client} from "../../../model/client";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-client-edit',
  templateUrl: './client-edit.component.html',
  styleUrls: ['./client-edit.component.css']
})
export class ClientEditComponent implements OnInit, OnChanges {

  @Input()
  client: Client = {};

  editClientForm: FormGroup;

  constructor() {
    this.editClientForm = new FormGroup({
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

  ngOnChanges(changes: SimpleChanges):void{
    console.log(changes);
  }

  editClient() {

  }
}
