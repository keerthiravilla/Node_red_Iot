import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

export class Dottore {
  constructor(
    email: string,
    password: string
  ) { }
}

export class User {
  constructor(
    email: string,
    password: string
  ) { }
}

@Injectable({
  providedIn: 'root'
})

export class HttpClientService {

  constructor(private httpClient: HttpClient){}

  getDottore() {
    return this.httpClient.get<Dottore[]>('http://localhost:8080/dottore');
  }

  getUtente() {
    return this.httpClient.get<User[]>('http://localhost:8080/user');
  }
}
