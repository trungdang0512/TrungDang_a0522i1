import { Component, OnInit } from '@angular/core';
import Swal from "sweetalert2/dist/sweetalert2.js";
import {Product} from "../../../model/product";
import {FormControl, FormGroup} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {ProductService} from "../../../service/product.service";


@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  product: Product = {};
  id: number;
  updateProductForm: FormGroup;

  constructor(private activatedRoute: ActivatedRoute,
              private productService: ProductService,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next =>{
      const id = next.get('id');
      if (id != null){
        this.productService.findProductById(parseInt(id)).subscribe(next =>{
          console.log(next);
          this.product = next;
          this.updateProductForm = new FormGroup({
            id: new FormControl(this.product.id),
            name: new FormControl(this.product.name),
            price: new FormControl(this.product.price),
            description: new FormControl(this.product.description)
          })
        });
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
  }

  update() {
    const product = this.updateProductForm.value;
    this.productService.editProduct(this.product.id, product).subscribe(()=>{
      this.alertWithSuccess();
      this.updateProductForm.reset();
    })
    this.route.navigateByUrl('/product/list');
  }

  alertWithSuccess(){
    Swal.fire('Done', 'You submitted succesfully!', 'success')
  }

}
