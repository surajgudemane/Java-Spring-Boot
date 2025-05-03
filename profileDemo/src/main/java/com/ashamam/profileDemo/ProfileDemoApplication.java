package com.ashamam.profileDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashamam.profileDemo.component.ProfileComponent;

@SpringBootApplication
public class ProfileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileDemoApplication.class, args);
//		SpringApplication app = new SpringApplication(ProfileDemoApplication.class);
//		app.setAdditionalProfiles("prod");
//		app.run(args);
	}

}
