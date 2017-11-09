package com.marcel.lavrigne.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.servlet.ServletContext;

@SpringBootApplication
@ComponentScan("com.marcel.lavrigne")
@EnableJpaRepositories("com.marcel.lavrigne.persistence")
@EntityScan("com.marcel.lavrigne.model")
public class Application extends SpringBootServletInitializer {

    @Autowired
    private ServletContext context;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}