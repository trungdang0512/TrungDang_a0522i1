import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Service} from "../../../model/service";

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {
  service: Service = {};
  @Output()
  eventEmit = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  addNewService() {
    this.eventEmit.emit(this.service);
    this.service = {};
  }
}
