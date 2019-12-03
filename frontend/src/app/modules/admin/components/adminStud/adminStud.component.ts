import {Component, OnInit, TemplateRef} from "@angular/core";
import {Prof} from "../adminProf/prof";
import {Subscription} from "rxjs";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Ng4LoadingSpinnerService} from "ng4-loading-spinner";
import {Stud} from "./stud";

@Component({
  selector: "app-adminStud",
  templateUrl: "./adminStud.component.html",
  styleUrls: ['./adminStud.component.css']
})
export class AdminStudComponent implements OnInit{

  public stud: Stud[];
  private subscriptions: Subscription[] = [];
  public editMode = false;
  public editableBa: Stud = new Stud();
  public modalRef: BsModalRef;

  ngOnInit(): void {
  }

  constructor(private loadingService: Ng4LoadingSpinnerService,
              private modalService: BsModalService) {
  }

  public _closeModal(): void {
    this.modalRef.hide();
  }

  public _openModal(template: TemplateRef<any>, stud: Stud): void {

    if (stud) {
      this.editMode = true;
      this.editableBa = Stud.cloneBase(stud);
    } else {
      this.refreshBa();
      this.editMode = false;
    }

    this.modalRef = this.modalService.show(template);
  }

  private refreshBa(): void {
    this.editableBa = new Stud();
  }
}
