import {Component, Input, OnChanges, OnInit, SimpleChange, SimpleChanges} from '@angular/core';
import {Client} from "../../../model/client";
import {FormControl, FormGroup} from "@angular/forms";
import Swal from "sweetalert2/dist/sweetalert2.js";
import {ActivatedRoute, Router} from "@angular/router";
import {ClientServiceService} from "../../../service/client-service.service";


@Component({
  selector: 'app-client-edit',
  templateUrl: './client-edit.component.html',
  styleUrls: ['./client-edit.component.css']
})
export class ClientEditComponent implements OnInit {
  client: Client = {};
  id: number;

  editClientForm: FormGroup;

  constructor(private activatedRoute: ActivatedRoute,
              private clientService: ClientServiceService,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.clientService.findClientById(parseInt(id)).subscribe(next =>{
          console.log(next);
          this.client = next;
          this.editClientForm = new FormGroup({
            id: new FormControl(this.client.id),
            nameClient: new FormControl(this.client.nameClient),
            idClient: new FormControl(this.client.idClient),
            typeClient: new FormControl(this.client.typeClient),
            dateOfBirth: new FormControl(this.client.dateOfBirth),
            phone: new FormControl(this.client.phone),
            email: new FormControl(this.client.email),
            address: new FormControl(this.client.address)
          })
        });
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
  }

   editClient() {
     const client = this.editClientForm.value;
     this.clientService.editProduct(this.client.id, client).subscribe(()=>{
       this.editClientForm.reset();
     })
     this.route.navigateByUrl('/client');
     Swal.fire('Done', 'You submitted succesfully!', 'success')
   }
}
