import {Component,  OnInit} from '@angular/core';
import {Contract} from "../../../model/contract";
import {FormControl, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import {ContractService} from "../../../service/contract.service";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  contract: Contract = {};
  createContractForm: FormGroup;

  constructor(private route: Router,
              private contractService: ContractService) {
    this.createContractForm = new FormGroup({
        id: new FormControl(),
        employeeId: new FormControl(),
        clientId: new FormControl(),
        serviceId: new FormControl(),
        startDate: new FormControl(),
        endDate: new FormControl(),
        depositMoney: new FormControl(),
        totalMoney: new FormControl(),
    })
  }

  ngOnInit(): void {
  }

  createNewContract() {
    const contract = this.createContractForm.value;
    console.log(contract);
    this.contractService.saveContract(contract).subscribe(next =>{
      this.route.navigateByUrl('contract');
    });
    this.createContractForm.reset();
    Swal.fire('Done', 'You submitted succesfully!', 'success')
  }
}
