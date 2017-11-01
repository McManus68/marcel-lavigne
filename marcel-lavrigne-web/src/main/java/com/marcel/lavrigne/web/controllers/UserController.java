package com.marcel.lavrigne.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marcel.lavrigne.model.User;
import com.marcel.lavrigne.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController extends EntityController<User> {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public @ModelAttribute
    User getLoggedUser() {
        return ((UserService) srv).getLoggedUser();
    }
}
