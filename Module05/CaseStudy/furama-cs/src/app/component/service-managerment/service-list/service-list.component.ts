import { Component, OnInit } from '@angular/core';
import {Service} from "../../../model/service";
import {ActivatedRoute, Router} from "@angular/router";
import {ServiceService} from "../../../service/service.service";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {
  service : Service={};
  services : Service[] = [];

  constructor(private route: Router,
              private activatedRoute: ActivatedRoute,
              private serviceService: ServiceService) {
    this.serviceService.getAll().subscribe(next =>{
      console.log(next);
      this.services = next;
    });
  }

  ngOnInit(): void {
  }

  deleteService(deleteService: Service) {
    Swal.fire({
      title: 'Are you sure want to remove? ' + deleteService.nameService,
      text: 'You will not be able to recover this service!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.serviceService.deleteService(deleteService.id).subscribe(()=>{
          this.route.navigateByUrl('/service');
        });
        Swal.fire(
          'Deleted!',
          deleteService.nameService + ' has been deleted.',
          'success'
        )

      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Cancelled deleting service ' + deleteService.nameService,
          'error'
        )
      }
    })
  }
}
