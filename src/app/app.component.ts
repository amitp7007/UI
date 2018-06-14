import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { AuthenticationService } from './services/authentication.service';
import { Router } from '@angular/router';
import 'rxjs/add/operator/finally';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Spring Boot Angular 4 Auth';
  data = {};
 // constructor(private http: HttpClient) {
   // http.get('resource').subscribe(data => this.data = data);
 // }

  constructor(private app: AuthenticationService, private http: HttpClient, private router: Router) {
    this.app.authenticate(undefined, undefined);
  }
  logout() {
    this.http.post('logout', {}).finally(() => {
       this.app.authenticated = false;
        this.router.navigateByUrl('/login');
    }).subscribe();
  }
}
