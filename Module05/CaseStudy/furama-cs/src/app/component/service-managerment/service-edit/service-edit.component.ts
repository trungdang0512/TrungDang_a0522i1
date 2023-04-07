import {Component, Input, OnInit, SimpleChanges} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Service} from "../../../model/service";
import {ActivatedRoute, Router} from "@angular/router";
import {ServiceService} from "../../../service/service.service";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-service-edit',
  templateUrl: './service-edit.component.html',
  styleUrls: ['./service-edit.component.css']
})
export class ServiceEditComponent implements OnInit {
  service: Service = {};
  id: number;

  editServiceForm: FormGroup;

  constructor(private activatedRoute: ActivatedRoute,
              private serviceService: ServiceService,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.serviceService.findServiceById(parseInt(id)).subscribe(next =>{
          console.log(next);
          this.service = next;
          this.editServiceForm = new FormGroup({
            id: new FormControl(this.service.id),
            nameService: new FormControl(this.service.nameService),
            area: new FormControl(this.service.area),
            floor: new FormControl(this.service.floor),
            peopleNumber: new FormControl(this.service.peopleNumber),
            cost: new FormControl(this.service.cost),
            hireType: new FormControl(this.service.hireType),
            status: new FormControl(this.service.status)
          })
        });
      }
    }, error => {
    }, () =>{
    });
  }

  ngOnInit(): void {
  }

  editService() {
    const service = this.editServiceForm.value;
    this.serviceService.editService(this.service.id, service).subscribe(()=>{
      this.editServiceForm.reset();
    })
    this.route.navigateByUrl('/service');
    Swal.fire('Done', 'You submitted succesfully!', 'success')
  }
}
