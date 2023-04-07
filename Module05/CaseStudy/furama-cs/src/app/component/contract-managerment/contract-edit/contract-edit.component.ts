import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Contract} from "../../../model/contract";
import {ActivatedRoute, Router} from "@angular/router";
import {ContractService} from "../../../service/contract.service";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-contract-edit',
  templateUrl: './contract-edit.component.html',
  styleUrls: ['./contract-edit.component.css']
})
export class ContractEditComponent implements OnInit {
  contract: Contract= {};
  id: number;

  editContractForm: FormGroup;

  constructor(private activatedRoute: ActivatedRoute,
              private route: Router,
              private contractService: ContractService) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.contractService.findContractById(parseInt(id)).subscribe(next =>{
          console.log(next);
          this.contract = next;
          this.editContractForm = new FormGroup({
            id: new FormControl(this.contract.id),
            employeeId: new FormControl(this.contract.employeeId),
            clientId: new FormControl(this.contract.clientId),
            serviceId: new FormControl(this.contract.serviceId),
            startDate: new FormControl(this.contract.startDate),
            endDate: new FormControl(this.contract.endDate),
            depositMoney: new FormControl(this.contract.depositMoney),
            totalMoney: new FormControl(this.contract.totalMoney),
          })
        });
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
  }

  editContract() {
    const contract = this.editContractForm.value;
    this.contractService.editContract(this.contract.id, contract).subscribe(()=>{
      this.editContractForm.reset();
    })
    this.route.navigateByUrl('/contract');
    Swal.fire('Done', 'You submitted succesfully!', 'success')
  }
}
