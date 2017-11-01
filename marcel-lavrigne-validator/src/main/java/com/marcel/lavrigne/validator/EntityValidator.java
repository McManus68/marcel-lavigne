package com.marcel.lavrigne.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Validator;

import com.marcel.lavrigne.model.MarcelLavrigneEntity;
import com.marcel.lavrigne.services.EntityService;

import java.lang.reflect.ParameterizedType;

public abstract class EntityValidator<T extends MarcelLavrigneEntity> implements Validator {

    @Autowired
    protected EntityService<T> service;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

}
