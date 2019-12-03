import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TestLiterature} from "../modules/menu/components/materials/testLiterature";

@Injectable()

export class TestLiteratureService { //todo create interface

  constructor(private http: HttpClient) {
  }

  getTestLiterature(): Observable<TestLiterature[]> {
    return this.http.get<TestLiterature[]>('/api/testLiterature');
  }

}
