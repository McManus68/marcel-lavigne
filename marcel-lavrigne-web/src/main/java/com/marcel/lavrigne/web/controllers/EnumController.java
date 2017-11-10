package com.marcel.lavrigne.web.controllers;

import com.marcel.lavrigne.services.EnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("rest/enum")
public class EnumController {

    @Autowired
    EnumService service;

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "{name}")
    public Set<Enum> get(@PathVariable String name) {
        return service.get(name);
    }
}
