package com.marcel.lavigne.web.controllers;

import com.marcel.lavigne.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("rest/events")
public class EventController extends EntityController<Event> {
}
