import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserRegistationService {

  constructor(private http: HttpClient) { }


  public doRegistration(user) {
    return this.http.post("http://localhost:8080/register",user,{responseType:'text' as 'json'});
  }

  public getUsers() {
    return this.http.get("http://localhost:8080/getAllUsers");
  }

  public getUserByName(name) {
    return this.http.get("http://localhost:8080//findUser/"+ name);
  }

  public deleteUser(id) {
    return this.http.delete("http://localhost:8080/cancel/"+id);
  }
}
