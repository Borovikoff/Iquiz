import {Component, OnInit, TemplateRef} from "@angular/core";
import {Subscription} from "rxjs";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Prof} from "./prof";
import {Category} from "../../../menu/components/category/category";
import {CategoryService} from "../../../../services/category.service";
import {Ng4LoadingSpinnerService} from "ng4-loading-spinner";

@Component({
  selector: "app-adminProf",
  templateUrl: "./adminProf.component.html",
  styleUrls: ['./adminProf.component.css']
})
export class AdminProfComponent implements OnInit {

  public profs: Prof[];
  private subscriptions: Subscription[] = [];
  public editMode = false;
  public editableBa: Prof = new Prof();
  public modalRef: BsModalRef;

  ngOnInit(): void {
  }

  constructor(private loadingService: Ng4LoadingSpinnerService,
              private modalService: BsModalService) {
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  public _openModal(template: TemplateRef<any>, prof: Prof): void {

    if (prof) {
      this.editMode = true;
      this.editableBa = Prof.cloneBase(prof);
    } else {
      this.refreshBa();
      this.editMode = false;
    }

    this.modalRef = this.modalService.show(template);
  }

  private refreshBa(): void {
    this.editableBa = new Prof();
  }
}
