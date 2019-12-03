import {Component, OnInit} from '@angular/core';
import {Subscription} from "rxjs";
import {TestLiterature} from "./testLiterature";
import {Ng4LoadingSpinnerService} from "ng4-loading-spinner";
import {TestLiteratureService} from "../../../../services/testLiterature.service";

@Component({
  selector: 'app-literature',
  templateUrl: './literature.component.html',
  styleUrls: ['./literature.component.css']
})
export class LiteratureComponent implements OnInit {
  public testLiterature: TestLiterature[] = [];
  private subscriptions: Subscription[] = [];

  ngOnInit() {
    this.loadTestLiterature();
  }

  constructor(private testLiteratureService: TestLiteratureService,
              private loadingService: Ng4LoadingSpinnerService) {
  }

  private loadTestLiterature(): void {
    this.loadingService.show();

    this.subscriptions.push(this.testLiteratureService.getTestLiterature().subscribe(tests => {
      this.testLiterature = tests as TestLiterature[];
      console.log(this.testLiterature);
      this.loadingService.hide();
    }));
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach(subscription => subscription.unsubscribe());
  }

}
