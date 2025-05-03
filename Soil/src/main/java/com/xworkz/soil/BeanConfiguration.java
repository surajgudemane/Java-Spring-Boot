package com.xworkz.soil;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.soil")
@EnableWebMvc
public class BeanConfiguration implements WebMvcConfigurer{

	public BeanConfiguration() {
		System.out.println("From Soil Connfig Classs");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "red.jsp");
	}
	
}
