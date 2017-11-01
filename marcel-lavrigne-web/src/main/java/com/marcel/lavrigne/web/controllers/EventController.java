package com.marcel.lavrigne.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcel.lavrigne.model.User;

@RestController
@RequestMapping(value = "/events")
public class EventController extends EntityController<User> {

}
