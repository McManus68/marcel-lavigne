package com.marcel.lavigne.web.controllers;

import com.marcel.lavigne.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest/users")
public class UserController extends EntityController<User> {
}
