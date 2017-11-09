package com.marcel.lavrigne.web.controllers;

import com.marcel.lavrigne.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends EntityController<User> {

}
