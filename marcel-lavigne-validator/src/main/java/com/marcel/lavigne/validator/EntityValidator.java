package com.marcel.lavigne.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Validator;

import com.marcel.lavigne.model.MarcelLavigneEntity;
import com.marcel.lavigne.services.EntityService;

import java.lang.reflect.ParameterizedType;

public abstract class EntityValidator<T extends MarcelLavigneEntity> implements Validator {

    @Autowired
    protected EntityService<T> service;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

}
