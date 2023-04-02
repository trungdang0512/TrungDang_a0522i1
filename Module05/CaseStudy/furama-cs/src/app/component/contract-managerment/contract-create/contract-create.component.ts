import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Contract} from "../../../model/contract";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  contract: Contract = {};
  @Output()
  eventEmit = new EventEmitter();

  createContractForm: FormGroup;

  constructor() {
    this.createContractForm = new FormGroup({
      idContract: new FormControl(''),
      idEmployee: new FormControl(''),
      idClient: new FormControl(''),
      idService: new FormControl(''),
      startDate: new FormControl(''),
      endDate: new FormControl(''),
      depositMoney: new FormControl(''),
      totalMoney: new FormControl(''),
    })
  }

  ngOnInit(): void {
  }

  createNewContract() {
    console.log(this.createContractForm)
    if (this.createContractForm.valid){
      console.log(this.createContractForm.value)
      this.eventEmit.emit(this.createContractForm.value);
    }
  }
}
