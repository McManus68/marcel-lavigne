package com.marcel.lavrigne.web.controllers;

import com.marcel.lavrigne.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest/users")
public class UserController extends EntityController<User> {
}
