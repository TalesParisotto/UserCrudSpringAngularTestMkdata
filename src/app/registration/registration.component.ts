import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserRegistationService } from '../user-registation.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {


  user: any = new User('', '', 0, 0, 0, 0, new Date(), false , 0);
  message: any;

  constructor(private service: UserRegistationService) { }

  ngOnInit() {
  }

  public registerNow() {
    if (this.user.type === 'pf') {
      this.user.cnpj = 0;
      this.user.ies = 0;
    } else {
      this.user.cpf = 0;
      this.user.rg = 0;
    }
    const resp = this.service.doRegistration(this.user);
    resp.subscribe((data) => this.message = data);
  }

}
