import {Component, OnInit, TemplateRef} from "@angular/core";
import {Category} from "../../../menu/components/category/category";
import {Subscription} from "rxjs";
import {CategoryService} from "../../../../services/category.service";
import {Ng4LoadingSpinnerService} from "ng4-loading-spinner";
import {BsModalRef, BsModalService} from "ngx-bootstrap";


@Component({
  selector: "app-adminCategory",
  templateUrl: "./adminCategory.component.html",
  styleUrls: ['./adminCategory.component.css']
})
export class AdminCategoryComponent implements OnInit {
  public categories: Category[];
  private subscriptions: Subscription[] = [];
  public editMode = false;
  public editableBa: Category = new Category();
  public modalRef: BsModalRef;

  ngOnInit() {
    this.loadCategory();
  }

  constructor(private categoryService: CategoryService,
              private loadingService: Ng4LoadingSpinnerService,
              private modalService: BsModalService) {
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
  public _addCategory(): void {
    this.loadingService.show();
    this.subscriptions.push(this.categoryService.saveCategory(this.editableBa).subscribe(() => {
      this._updateCategory();
      this.refreshBa();
      this._closeModal();
      this.loadingService.hide();

    }));
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  public _openModal(template: TemplateRef<any>, category: Category): void {

    if (category) {
      this.editMode = true;
      this.editableBa = Category.cloneBase(category);
    } else {
      this.refreshBa();
      this.editMode = false;
    }

    this.modalRef = this.modalService.show(template);
  }

  private refreshBa(): void {
    this.editableBa = new Category();
  }
}
