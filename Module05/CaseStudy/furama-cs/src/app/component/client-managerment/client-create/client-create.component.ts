import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Client} from "../../../model/client";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import {ClientServiceService} from "../../../service/client-service.service";
import Swal from "sweetalert2/dist/sweetalert2.js";
import {ClientTypeService} from "../../../service/client-type.service";
import {CustomerType} from "../../../model/CustomerType";

@Component({
  selector: 'app-client-create',
  templateUrl: './client-create.component.html',
  styleUrls: ['./client-create.component.css']
})
export class ClientCreateComponent implements OnInit {
  client : Client ={};
  customerTypes : CustomerType[] = [];


  createClientForm: FormGroup;

  constructor(private route: Router,
              private clientService: ClientServiceService,
              private clientTypeService: ClientTypeService) {
    this.clientTypeService.getAll().subscribe(next => {
      this.customerTypes = next;
      this.createClientForm = new FormGroup({
        id: new FormControl(""),
        nameClient: new FormControl("",[
          Validators.required,
          Validators.minLength(3),
          Validators.maxLength(45)
        ]),
        idClient: new FormControl("",[
          Validators.required,
          Validators.pattern('^\\d{9}|\\d{12}$')
        ]),
        typeClient: new FormControl("",[Validators.required]),
        dateOfBirth: new FormControl("",[
          Validators.required,
          this.pastDateValidator,
        ]),
        phone: new FormControl("",[
          Validators.required,
          Validators.pattern('^[0-9]{10}$')
        ]),
        email: new FormControl("",[
          Validators.required,
          Validators.email
        ]),
        address: new FormControl("",[Validators.required])
      })
    })
  }

  ngOnInit(): void {
  }

  pastDateValidator(control: FormControl) {
    const inputDate = new Date(control.value);
    const currentDate = new Date();
    if (inputDate > currentDate) {
      return { pastDate: true };
    }
    return null;
  }


  addNewClient() {
    console.log(this.createClientForm.value);
    if(this.createClientForm.valid){
      this.clientService.saveClient(this.createClientForm.value).subscribe(next =>{
        this.route.navigateByUrl('client');
      });
      Swal.fire('Done', 'You submitted succesfully!', 'success')
    }
    }
}
