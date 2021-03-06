package com.marcel.lavigne.web.controllers;

import com.marcel.lavigne.model.MarcelLavigneEntity;
import com.marcel.lavigne.services.EntityService;
import com.marcel.lavigne.validator.EntityValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class EntityController<T extends MarcelLavigneEntity> {

    @Autowired
    protected EntityService<T> srv;

    @Autowired(required = false)
    protected EntityValidator<T> validator;

    @GetMapping
    public List<T> getAll() {
        return srv.getAll();
    }

    @GetMapping(value = "{id}")
    public T get(@PathVariable Long id) {
        return srv.get(id);
    }

    @PostMapping
    public Long add(@Valid @RequestBody T entity, BindingResult result)  {
        return srv.add(entity);
    }

    @PutMapping(value = "{id}")
    public Long update(@Valid @RequestBody T entity, BindingResult result)  {
        return srv.update(entity);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id) {
        srv.delete(srv.get(id));
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(validator);
    }
}
