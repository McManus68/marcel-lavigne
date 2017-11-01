package com.itkweb.bv.web.config;

import com.marcel.lavrigne.web.config.WebConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.marcel.lavrigne" })
public class WebAppInitializer implements WebApplicationInitializer {

	private static final String DISPATCH_SERVLET_NAME = "dispatcher";
	private static final String DISPATCH_SERVLET_MAPPING = "/rest/*";

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebConfig.class);
		servletContext.addListener(new ContextLoaderListener(rootContext));
		FilterRegistration.Dynamic osivRegistration = servletContext.addFilter("OSIV-filter", OpenEntityManagerInViewFilter.class);
		osivRegistration.addMappingForUrlPatterns(null, true, "/*");
		final ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCH_SERVLET_NAME, new DispatcherServlet(rootContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping(DISPATCH_SERVLET_MAPPING);
	}

}
