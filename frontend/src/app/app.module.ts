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

import {MainComponent} from "./components/main/main.component";
import {CategoryComponent} from "./components/category/category.component";
import {HeaderComponent} from "./components/header/header.component";
import {FooterComponent} from "./components/footer/footer.component";
import {SignInComponent} from "./components/signIn/signIn.component";
import {RegistrComponent} from "./components/registr/registr.component";
import {AboutComponent} from "./components/about/about.component";


const appRoutes: Routes = [
  {path: 'category', component: CategoryComponent},
  {path: '', component: MainComponent},
  {path: 'signIn', component: SignInComponent},
  {path: 'registr', component: RegistrComponent},
  {path: 'about', component: AboutComponent},

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
    AboutComponent
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
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
