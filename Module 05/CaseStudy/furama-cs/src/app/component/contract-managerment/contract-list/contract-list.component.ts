import { Component, OnInit } from '@angular/core';
import {Contract} from "../../../model/contract";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  contract: Contract = {};
  contracts: Contract[] = [
    {idContract:1,
      idEmployee: 1,
      idClient: 1,
      idService: 1,
      startDate: "abc",
      endDate: "bcd",
      depositMoney: 1000000,
      totalMoney: 9000000,
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

  addNewContract(event: any){
    this.contracts.push(event);
  }
}
