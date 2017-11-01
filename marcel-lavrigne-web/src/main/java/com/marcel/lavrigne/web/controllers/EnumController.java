package com.marcel.lavrigne.web.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marcel.lavrigne.services.EnumService;

@RestController
@RequestMapping(value = "enum")
public class EnumController {

    @Autowired
    EnumService service;

    @SuppressWarnings("rawtypes")
	@ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public Set<Enum> get(@PathVariable String name) {
        return service.get(name);
    }
}
