package com.marcel.lavrigne.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcel.lavrigne.model.MarcelLavrigneEntity;
import com.marcel.lavrigne.services.EntityService;
import com.marcel.lavrigne.validator.EntityValidator;

public abstract class EntityController<T extends MarcelLavrigneEntity> {

    @Autowired
    protected EntityService<T> srv;

    @Autowired(required = false)
    protected EntityValidator<T> validator;

    @ModelAttribute
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public List<T> getAll(@RequestParam(value = "view", required = false) String view) {
        return srv.getAll();
    }

    @ModelAttribute
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public T get(@PathVariable Long id, @RequestParam(value = "view", required = false) String view) {
        return srv.get(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Long add(@Valid @RequestBody T entity, BindingResult result)  {
        if (result.hasErrors()) {

        }
        return srv.add(entity);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Long update(@Valid @RequestBody T entity, BindingResult result)  {
        if (result.hasErrors()) {

        }
        return srv.update(entity);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        srv.delete(srv.get(id));
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(validator);
    }
}
