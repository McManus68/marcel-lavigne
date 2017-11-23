package com.marcel.lavigne.services.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.marcel.lavigne.services.EnumService;

import java.util.EnumSet;
import java.util.Set;

@Service
public class EnumServiceImpl implements EnumService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnumServiceImpl.class);

    private static final String BASE_ENUM_PACKAGE = "com.marcel.lavigne.model.enumeration.";

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public Set<Enum> get(String name) {
        try {
            final Class<Enum> enumerationClass = (Class<Enum>) Class.forName(BASE_ENUM_PACKAGE + name);
            return EnumSet.allOf(enumerationClass);
        } catch (final ClassNotFoundException e) {
            LOGGER.error("ClassNotFoundException on " + name, e);
            throw new RuntimeException("enum.not.found" + name);
        }
    }

}