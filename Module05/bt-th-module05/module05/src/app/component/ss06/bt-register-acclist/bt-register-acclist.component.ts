import { Component, OnInit } from '@angular/core';
import {Account} from "../bt-register-form/account";

@Component({
  selector: 'app-bt-register-acclist',
  templateUrl: './bt-register-acclist.component.html',
  styleUrls: ['./bt-register-acclist.component.css']
})
export class BtRegisterAcclistComponent implements OnInit {
  account: Account = {};
  accounts: Account[] = [];

  constructor() { }

  ngOnInit(): void {
  }

  addnewAccount(event: any): void{
    this.accounts.push(event);
  }
}
