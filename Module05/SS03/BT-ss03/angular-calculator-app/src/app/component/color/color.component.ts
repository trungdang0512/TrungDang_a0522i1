import { Component, OnInit } from '@angular/core';
import { Color } from "./color";

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  color : Color = {
    color : "#FFFFFF"
  }

  constructor() { }

  ngOnInit(): void {
  }

}
