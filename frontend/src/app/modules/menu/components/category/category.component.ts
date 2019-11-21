import {Component, OnInit} from "@angular/core";
import {Category} from "./category";
import {Ng4LoadingSpinnerService} from "ng4-loading-spinner";
import {Subscription} from "rxjs";
import {CategoryService} from "../../../../services/category.service";

@Component({
  selector: "app-category",
  templateUrl: "./category.component.html",
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  public categories: Category[];
  private subscriptions: Subscription[] = [];
  ngOnInit() {
    this.loadCategory();
  }

  constructor(private categoryService: CategoryService,
              private loadingService: Ng4LoadingSpinnerService) {
  }

  private loadCategory(): void {
    this.loadingService.show();
    this.subscriptions.push(this.categoryService.getCategory().subscribe(categories => {
      this.categories = categories as Category[];
      console.log(this.categories);
      this.loadingService.hide();
    }));
  }


  public _updateCategory(): void {
    this.loadCategory();
  }

  public _deleteCategory(id_category: string): void {
    this.loadingService.show();
    this.subscriptions.push(this.categoryService.deleteCategory(id_category).subscribe(() => {
      this._updateCategory();
    }));
  }

}
