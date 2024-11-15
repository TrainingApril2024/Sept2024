package com.learn;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class SpringInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(WebAppConfig.class);
		
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(applicationContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
