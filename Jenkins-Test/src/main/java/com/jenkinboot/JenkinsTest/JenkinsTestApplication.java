package com.jenkinboot.JenkinsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		System.out.println("Inside Spring Boot");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
}
