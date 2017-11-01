package com.marcel.lavrigne.validator;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.marcel.lavrigne.model.User;

@Service
public class UserValidator extends EntityValidator<User> implements Validator {

    @Override
    public void validate(Object target, Errors errors) {
    }
}
