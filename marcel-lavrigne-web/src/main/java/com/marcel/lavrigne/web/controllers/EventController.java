package com.marcel.lavrigne.web.controllers;

import com.marcel.lavrigne.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/events")
public class EventController extends EntityController<Event> {
}
