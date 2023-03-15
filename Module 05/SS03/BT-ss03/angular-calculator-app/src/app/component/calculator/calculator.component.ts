import { Component, OnInit } from '@angular/core';
import {Calculator} from "./cal";

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  calculator : Calculator = {
    num1 : 0,
    num2 : 0,
    result : 0
  }

  constructor() { }

  ngOnInit(): void {
  }

  sum(value: string, value2: string) {
    let x: number = parseInt(value);
    let y: number = parseInt(value2);
    let sum = x + y;
    this.calculator.result = sum;
  }

  sub(value: string, value2: string) {
    let x: number = parseInt(value);
    let y: number = parseInt(value2);
    let sub = x - y;
    this.calculator.result = sub;
  }

  mul(value: string, value2: string) {
    let x: number = parseInt(value);
    let y: number = parseInt(value2);
    let mul = x * y;
    this.calculator.result = mul;
  }

  div(value: string, value2: string) {
    let x: number = parseInt(value);
    let y: number = parseInt(value2);
    this.calculator.result = x / y;
  }
}
