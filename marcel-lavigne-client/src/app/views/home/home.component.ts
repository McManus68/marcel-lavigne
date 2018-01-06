import { Component, OnInit } from '@angular/core';

import { User } from '../../model/user';
import { UserService } from '../../services/user.service';

@Component({
    moduleId: module.id,
    templateUrl: 'home.component.html',
    styleUrls: ['./home.component.scss']
})

export class HomeComponent implements OnInit {
    users: User[] = [];

    constructor(private userService: UserService) { }

    ngOnInit() {
        // get users from secure api end point
        /*this.userService.getUsers()
            .subscribe(users => {
                this.users = users;
            });
        */
    }

}
