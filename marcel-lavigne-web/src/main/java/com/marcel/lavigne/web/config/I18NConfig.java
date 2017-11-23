package com.marcel.lavigne.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        final ReloadableResourceBundleMessageSource result = new ReloadableResourceBundleMessageSource();
        final String[] basenames = {
                "classpath:locale/enum",
                "classpath:locale/errors",
                "classpath:locale/fields",
                "classpath:locale/hibernate_validator"};
        result.setDefaultEncoding("UTF-8");
        result.setBasenames(basenames);
        return result;
    }

}