import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Category} from "../modules/menu/components/category/category";

@Injectable()

export class CategoryService { //todo create interface

  constructor(private http: HttpClient) {
  }


  getCategory(): Observable<Category[]> {
    return this.http.get<Category[]>('/api/category');
  }

  saveCategory(category: Category): Observable<Category> {
    return this.http.post<Category>('/api/category', category);
  }

  deleteCategory(categoryId: string): Observable<void> {
    return this.http.delete<void>('/api/category/' + categoryId);
  }

  getCategoryById(categoryId: string): Observable<Category> {
    return this.http.get<Category>('/api/category/' + categoryId);
  }
}
