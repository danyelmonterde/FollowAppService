package com.jil.church.followapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class FollowappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FollowappApplication.class, args);
	}

}
