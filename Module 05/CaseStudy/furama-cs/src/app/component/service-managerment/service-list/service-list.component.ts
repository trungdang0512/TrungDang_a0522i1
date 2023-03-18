import { Component, OnInit } from '@angular/core';
import {Service} from "../../../model/service";

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {
  service : Service={};
  services : Service[] = [
    {id:1,
      nameService: "Hiring Room",
      area: 20,
      floor: 1,
      peopleNumber: 4,
      cost: 1000,
      hireType: "Day Hiring",
      status: "New"
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

  addNewService(event: any):void{
    this.services.push(event);
  }
}
