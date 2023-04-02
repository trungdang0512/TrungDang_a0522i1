import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Service} from "../../../model/service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {
  service: Service = {};
  @Output()
  eventEmit = new EventEmitter();

  createNewServiceForm: FormGroup;

  constructor() {
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
    console.log(this.createNewServiceForm)
    if (this.createNewServiceForm.valid){
      console.log(this.createNewServiceForm.value)
      this.eventEmit.emit(this.createNewServiceForm.value);
    }
  }
}
