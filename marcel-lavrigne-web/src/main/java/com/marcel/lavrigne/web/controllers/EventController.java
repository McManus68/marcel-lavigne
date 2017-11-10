package com.marcel.lavrigne.web.controllers;

import com.marcel.lavrigne.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/events")
public class EventController extends EntityController<Event> {

    @Override
    @GetMapping
    public List<Event> getAll() {
        List<Event> events = new ArrayList<>();
        Event e = new Event();
        e.setDescription("coucou");
        e.setId(2l);
        e.setName("pwet");
        events.add(e);
        return events;
    }
}
