import { Component, OnInit } from '@angular/core';
import {Client} from "../../../model/client";
import {ClientServiceService} from "../../../service/client-service.service";
import {ActivatedRoute, Router} from "@angular/router";
import Swal from "sweetalert2/dist/sweetalert2.js";
import {faSearch, faSort} from "@fortawesome/free-solid-svg-icons";

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {
  client: Client ={};
  clients: Client[] = [];
  searchText;


  faSort = faSort;
  p : number =1;


  constructor(private clientService: ClientServiceService,
              private route: Router,
              private activatedRoute: ActivatedRoute) {
    this.clientService.getAll().subscribe(next =>{
      console.log(next);
      this.clients = next;
    });
  }

  ngOnInit(): void {
  }


  deleteClient(deleteClient: Client) {
    Swal.fire({
      title: 'Are you sure want to remove? ' + deleteClient.nameClient,
      text: 'You will not be able to recover this client!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.clientService.deleteProduct(deleteClient.id).subscribe(()=>{
          this.route.navigateByUrl('/client');
        });
        Swal.fire(
          'Deleted!',
          deleteClient.nameClient + ' has been deleted.',
          'success'
        )

      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Cancelled deleting client ' + deleteClient.nameClient,
          'error'
        )
      }
    })
  }

  key: string = 'name';
  reverse:boolean =false;
  sort(key) {
    this.key = key;
    this.reverse = !this.reverse;
  }

  findByTextExist(value: string) {
    this.clientService.findByName(value).subscribe(next=>this.clients = next)
  }
}
