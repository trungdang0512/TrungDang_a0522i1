import {Component, Input, OnInit, SimpleChanges} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Service} from "../../../model/service";

@Component({
  selector: 'app-service-edit',
  templateUrl: './service-edit.component.html',
  styleUrls: ['./service-edit.component.css']
})
export class ServiceEditComponent implements OnInit {
  @Input()
  service: Service = {};

  editServiceForm: FormGroup;

  constructor() {
    this.editServiceForm = new FormGroup({
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

  ngOnChanges(changes: SimpleChanges):void{
    console.log(changes);
  }

  editService() {

  }
}
