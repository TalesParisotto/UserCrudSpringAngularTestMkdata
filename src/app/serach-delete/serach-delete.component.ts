import { Component, OnInit } from '@angular/core';
import { UserRegistationService } from '../user-registation.service';

@Component({
  selector: 'app-serach-delete',
  templateUrl: './serach-delete.component.html',
  styleUrls: ['./serach-delete.component.css']
})
export class SerachDeleteComponent implements OnInit {

  users: any;
  name: string;

  constructor(private service: UserRegistationService) { }


    public delteUser(id: number) {
     const resp = this.service.deleteUser(id);
     resp.subscribe((data) => this.users = data);
    }

    public findUserByName() {
      const resp = this.service.getUserByName(this.name);
      resp.subscribe((data) => this.users = data);
     }

  ngOnInit() {
      const resp = this.service.getUsers();
      resp.subscribe((data) => this.users = data);
  }

}
