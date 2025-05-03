package com.ashamam.profileDemo.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@Profile("prod")
public class ProfileComponent {
	
	@Value("${message2}")
	String msg2;

	@Value("${message}")
	String msg;
	
	
	@Value("${prodSpecificKey}")
	String msgProd;

	@Value("${spring.profiles.active}")
	String go;
	
	@PostConstruct
	public void printMessage() {
		System.out.println("Prod Veriable - "+ msg);
		
		System.out.println("Defalut Veriable - "+ msg2);
		System.out.println("From Prodduction - "+ msgProd);
		System.out.println("Active Properties "+go);
	}
}
