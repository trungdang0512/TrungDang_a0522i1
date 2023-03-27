import { Component, OnInit } from '@angular/core';
import {DateUtilService} from "../../../service/date-util.service";

@Component({
  selector: 'app-th-timelines',
  templateUrl: './th-timelines.component.html',
  styleUrls: ['./th-timelines.component.css']
})
export class ThTimelinesComponent implements OnInit {
  output = '';

  constructor(private dateUtilService: DateUtilService) { }

  ngOnInit(): void {
  }

  onChange(value) {
    this.output = this.dateUtilService.getDiffToNow(value);
  }



}
