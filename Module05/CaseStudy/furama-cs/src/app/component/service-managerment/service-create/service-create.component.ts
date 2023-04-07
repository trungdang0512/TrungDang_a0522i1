import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Service} from "../../../model/service";
import {FormControl, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import {ServiceService} from "../../../service/service.service";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {
  service: Service = {};
  createNewServiceForm: FormGroup;

  constructor(private route: Router,
              private serviceService: ServiceService) {
    this.createNewServiceForm = new FormGroup({
      id: new FormControl(),
      nameService: new FormControl(),
      area: new FormControl(),
      floor: new FormControl(),
      peopleNumber: new FormControl(),
      cost: new FormControl(),
      hireType: new FormControl(),
      status: new FormControl()
    })
  }

  ngOnInit(): void {
  }

  addNewService() {
    const service = this.createNewServiceForm.value;
    this.serviceService.saveService(service).subscribe(next =>{
      this.route.navigateByUrl('service');
    });
    this.createNewServiceForm.reset();
    Swal.fire('Done', 'You submitted succesfully!', 'success')
  }
}
