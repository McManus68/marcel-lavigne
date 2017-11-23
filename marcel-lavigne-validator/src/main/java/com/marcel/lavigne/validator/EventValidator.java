package com.marcel.lavigne.validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.marcel.lavigne.model.Event;

@Service
public class EventValidator extends EntityValidator<Event> implements Validator {

    @Override
    public void validate(Object target, Errors errors) {

        Event event = (Event) target;
        event.getId();
        // errors.rejectValue("coverCropFraction", "plot.coverCropFraction.empty", null, null);
        
    }
}
