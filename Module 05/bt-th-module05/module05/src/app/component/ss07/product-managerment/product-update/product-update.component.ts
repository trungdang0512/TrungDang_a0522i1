import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Route, Router} from "@angular/router";
import {ProductService} from "../../../../service/product.service";
import {Product} from "../product";
import {FormControl, FormGroup} from "@angular/forms";
import Swal from "sweetalert2/dist/sweetalert2.js";

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  product: Product = {};
  id: number;
  updateProductForm: FormGroup;

  constructor(private activatedRoute: ActivatedRoute,
              private productService: ProductService,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.product = this.productService.findProductById(parseInt(id));
        console.log(this.product);
      }
    }, error => {
    }, () => {
    });
    this.updateProductForm = new FormGroup({
      id: new FormControl(this.product.id),
      name: new FormControl(this.product.name),
      price: new FormControl(this.product.price),
      description: new FormControl(this.product.description)
    })
  }

  ngOnInit(): void {
  }

  update() {
    const product = this.updateProductForm.value;
    this.productService.editProduct(product);
    this.updateProductForm.reset();
    this.alertWithSuccess();
    this.route.navigateByUrl('/product/list');
  }

  alertWithSuccess(){
    Swal.fire('Done', 'You submitted succesfully!', 'success')
  }
}
