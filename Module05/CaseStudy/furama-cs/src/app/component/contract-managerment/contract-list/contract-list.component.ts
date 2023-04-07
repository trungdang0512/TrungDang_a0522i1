import { Component, OnInit } from '@angular/core';
import {Contract} from "../../../model/contract";
import Swal from "sweetalert2/dist/sweetalert2.js";
import {ActivatedRoute, Router} from "@angular/router";
import {ContractService} from "../../../service/contract.service";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  contract: Contract = {};
  contracts: Contract[] = [];

  constructor(private route: Router,
              private activatedRoute: ActivatedRoute,
              private contractService: ContractService) {
    this.contractService.getAll().subscribe(next =>{
      console.log(next);
      this.contracts = next;
    });
  }

  ngOnInit(): void {
  }

  deleteContract(deleteContract: Contract) {
    Swal.fire({
      title: 'Are you sure want to remove? ' + deleteContract.id,
      text: 'You will not be able to recover this contract!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.contractService.deleteContract(deleteContract.id).subscribe(()=>{
          this.route.navigateByUrl('/contract');
        });
        Swal.fire(
          'Deleted!',
          deleteContract.id + ' has been deleted.',
          'success'
        )

      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Cancelled deleting contract ' + deleteContract.id,
          'error'
        )
      }
    })
  }
}
