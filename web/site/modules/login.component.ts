import {Component} from 'angular2/core';

@Component({
    selector: 'login',
    templateUrl: 'login.html'
})
export class LoginComponent{
    username = "";
    password = "";
}