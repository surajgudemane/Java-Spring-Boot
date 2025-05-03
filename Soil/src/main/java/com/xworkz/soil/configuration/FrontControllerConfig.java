package com.xworkz.soil.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.soil.BeanConfiguration;
//import com.xworkz.soil.SoilConfig;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	public FrontControllerConfig() {
		System.out.println("This is from Front configuration classss");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
		return  new String[] {"/"};
	}

}
