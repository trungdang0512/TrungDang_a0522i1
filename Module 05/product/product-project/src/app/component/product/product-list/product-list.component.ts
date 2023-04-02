import { Component, OnInit } from '@angular/core';
import Swal from "sweetalert2/dist/sweetalert2.js";
import {Product} from "../../../model/product";
import {ProductService} from "../../../service/product.service";
import {ActivatedRoute, Router} from "@angular/router";


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  product: Product = {};
  products: Product[] = [];

  constructor(private productService: ProductService,
              private route: Router,
              private activatedRoute: ActivatedRoute) {
    this.productService.getAll().subscribe(next =>{
      console.log(next);
      this.products = next;
    });
  }

  ngOnInit(): void {
  }

  modalDeleteProduct(deleteProduct: Product){
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.productService.findProductById(parseInt(id)).subscribe(next =>{
          console.log(next);
          this.product = next;
        });
      }
    }, error => {
    }, () => {
    });

    Swal.fire({
      title: 'Are you sure want to remove? ' + deleteProduct.name,
      text: 'You will not be able to recover this product!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.productService.deleteProduct(deleteProduct.id).subscribe(()=>{
          this.route.navigateByUrl('/product/list');
        });
        Swal.fire(
          'Deleted!',
          deleteProduct.name + ' has been deleted.',
          'success'
        )

      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Cancelled deleting product ' + deleteProduct.name,
          'error'
        )
      }
    })
  }

}
