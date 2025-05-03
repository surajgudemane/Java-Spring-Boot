package com.xworkz.soil.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SoilController {

	public SoilController(){
		System.out.println("This soil Controller class");
	}
	
	@RequestMapping("/save")
	public String soil() {
		return "black.jsp";
	}
	
}
