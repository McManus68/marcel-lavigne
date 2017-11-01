package com.marcel.lavrigne.web.config;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.paths.RelativeSwaggerPathProvider;
import com.mangofactory.swagger.paths.SwaggerPathProvider;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger
public class SwaggerConfig {

    @Autowired
    SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    ServletContext servletContext;

    @Bean
    public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin() {
        return new SwaggerSpringMvcPlugin(springSwaggerConfig)
                .apiInfo(apiInfo())
                .pathProvider(pathProvider());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Marcel Lavigne", "Specifications for API REST", "", "", "", "");
    }

    @Bean
    public SwaggerPathProvider pathProvider() {
        RelativeSwaggerPathProvider pathProvider = new RelativeSwaggerPathProvider(servletContext);
        pathProvider.setApiResourcePrefix("rest");
        return pathProvider;
    }
}