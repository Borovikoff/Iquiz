import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import {BsDropdownModule} from "ngx-bootstrap/dropdown";
import {TooltipModule} from "ngx-bootstrap/tooltip";
import {ModalModule} from "ngx-bootstrap/modal";
import {FormsModule} from "@angular/forms";

import {AppComponent} from "./app.component";
import {HttpClientModule} from "@angular/common/http";
import {Ng4LoadingSpinnerModule} from "ng4-loading-spinner";
import {RouterModule, Routes} from "@angular/router";

import {MainComponent} from "./modules/menu/components/main/main.component";
import {CategoryComponent} from "./modules/menu/components/category/category.component";
import {HeaderComponent} from "./modules/header/header.component";
import {FooterComponent} from "./modules/footer/footer.component";
import {SignInComponent} from "./modules/menu/components/signIn/signIn.component";
import {RegistrComponent} from "./modules/menu/components/registr/registr.component";
import {AboutComponent} from "./modules/menu/components/about/about.component";
import {AdminMenuComponent} from "./modules/admin/components/adminMenu/adminMenu.component";
import {AdminCategoryComponent} from "./modules/admin/components/adminCategory/adminCategory.component";
import {AdminQuestionComponent} from "./modules/admin/components/adminQuestion/adminQuestion.component";
import {AdminLiteratureComponent} from "./modules/admin/components/adminLiterature/adminLiterature.component";
import {AdminProfComponent} from "./modules/admin/components/adminProf/adminProf.component";
import {AdminTestsComponent} from "./modules/admin/components/adminTests/adminTests.component";
import {AdminStudComponent} from "./modules/admin/components/adminStud/adminStud.component";
import {CategoryService} from "./services/category.service";
import {ErrorComponent} from "./modules/layout/404/error.component";
import {LiteratureComponent} from "./modules/menu/components/materials/literature.component";
import {ProfMenuComponent} from "./modules/prof/components/profMenu/profMenu.component";
import {ProfLiteratureComponent} from "./modules/prof/components/profLiterature/profLiterature.component";
import {ProfQuestionComponent} from "./modules/prof/components/profQuestion/profQuestion.component";
import {ProfStudComponent} from "./modules/prof/components/profStud/profStud.component";
import {ProfStatisticComponent} from "./modules/prof/components/profStatistic/profStatistic.component";
import {ProfTestsComponent} from "./modules/prof/components/profTests/profTests.component";


const appRoutes: Routes = [
  {path: 'category', component: CategoryComponent},
  {path: 'aboutUs', component: AboutComponent},
  {path: '', component: MainComponent},
  {path: 'signIn', component: SignInComponent},
  {path: 'registr', component: RegistrComponent},
  {path: 'adminTests', component: AdminTestsComponent},
  {path: 'adminStud', component: AdminStudComponent},
  {path: 'adminQuestion', component: AdminQuestionComponent},
  {path: 'adminCategory', component: AdminCategoryComponent},
  {path: 'adminLiterature', component: AdminLiteratureComponent},
  {path: 'adminProf', component: AdminProfComponent},
  {path: 'adminMenu', component: AdminMenuComponent},
  {path: 'literature', component: LiteratureComponent},
  {path: 'profMenu', component: ProfMenuComponent},
  {path: 'profLiterature', component: ProfLiteratureComponent},
  {path: 'profQuestion', component: ProfQuestionComponent},
  {path: 'profStud', component: ProfStudComponent},
  {path: 'profStatistic', component: ProfStatisticComponent},
  {path: 'profTests', component: ProfTestsComponent},


  {path: '**', component: ErrorComponent},

];

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    CategoryComponent,
    HeaderComponent,
    FooterComponent,
    SignInComponent,
    RegistrComponent,
    AboutComponent,
    AdminMenuComponent,
    AdminCategoryComponent,
    AdminTestsComponent,
    AdminStudComponent,
    AdminQuestionComponent,
    AdminProfComponent,
    AdminLiteratureComponent,
    ErrorComponent,
    ProfMenuComponent,
    LiteratureComponent,
    ProfLiteratureComponent,
    ProfQuestionComponent,
    ProfTestsComponent,
    ProfStatisticComponent,
    ProfStudComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    Ng4LoadingSpinnerModule.forRoot(),
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
    RouterModule.forRoot(appRoutes)
  ],
  providers: [CategoryService],
  bootstrap: [AppComponent],
  exports: [CategoryComponent]
})
export class AppModule {
}
