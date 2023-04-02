import { Component, OnInit } from '@angular/core';
import {Category} from '../category';
import {CategoryService} from '../../../../../service/category.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Product} from '../../product/product';
import Swal from 'sweetalert2/dist/sweetalert2.js';


@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {
  category: Category = {};
  categories: Category[] = [];

  constructor(private categoryService: CategoryService,
              private route: Router,
              private activatedRoute: ActivatedRoute) {
    this.categoryService.getAll().subscribe(next => {
      console.log(next);
      this.categories = next;
    });
  }

  ngOnInit(): void {
  }

  modalDeleteCategory(deleteCategory: Category) {

    Swal.fire({
      title: 'Are you sure want to remove? ' + deleteCategory.name,
      text: 'You will not be able to recover this category!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.categoryService.deleteCategory(deleteCategory.id).subscribe(() => {
          this.route.navigateByUrl('/category/list');
        });
        Swal.fire(
          'Deleted!',
          deleteCategory.name + ' has been deleted.',
          'success'
        );

      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Cancelled deleting category ' + deleteCategory.name,
          'error'
        );
      }
    });

  }
}
