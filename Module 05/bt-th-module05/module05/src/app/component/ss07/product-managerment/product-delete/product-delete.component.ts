import { Component, OnInit } from '@angular/core';
import {Product} from "../product";
import {ActivatedRoute, Router} from "@angular/router";
import {ProductService} from "../../../../service/product.service";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
    product: Product = {};
  id: number;

  constructor(private activatedRoute: ActivatedRoute,
              private productService: ProductService,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.product = this.productService.findProductById(parseInt(id));
        console.log(this.product);
        this.modalDeleteProduct();
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
  }

  modalDeleteProduct(){
    Swal.fire({
      title: 'Are you sure want to remove?' + this.product.name,
      text: 'You will not be able to recover this product!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.productService.deleteProduct(this.product.id);
        Swal.fire(
          'Deleted!',
          this.product.name + ' has been deleted.',
          'success'
        )
        this.route.navigateByUrl('/product/list');
      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Cancelled deleting product ' + this.product.name,
          'error'
        )
        this.route.navigateByUrl('/product/list');
      }
    })
  }
}
