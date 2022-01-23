import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { CanActivate, RouteConfigLoadEnd, Router } from '@angular/router';
import jwt_decode from "jwt-decode";



export class User{
  constructor(
    public id: number,
    public email: string,
    public password: string,
    public token: string,
    public name: string,
    public surname: string

  ) {}
}



export class JwtResponse{
  constructor(
    public jwttoken:string,
     ) {}
  
}

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private httpClient:HttpClient, private router: Router) { 
     }

  authenticate(email, password) {
    return this.httpClient.post<User>('http://localhost:8080/authenticate',{email,password}).pipe(
      map(
        userData => {
        sessionStorage.setItem('email',email);
        
        sessionStorage.setItem('id', String(userData.id));

        sessionStorage.setItem('name',userData.name);
        
        sessionStorage.setItem('surname', userData.surname);

        sessionStorage.setItem('password', password);


        let tokenStr= userData.token;
        sessionStorage.setItem('token', tokenStr);
        return userData;
        }
      )

    );
  }
  
  isUserLoggedIn() {
    let user = sessionStorage.getItem('token');
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('email');
    sessionStorage.removeItem('token');
    sessionStorage.removeItem('id');
    this.router.navigate(['/']);
  }

  getRole(){
    let token = jwt_decode(sessionStorage.getItem('token'));
    return token['role'];
  }
}