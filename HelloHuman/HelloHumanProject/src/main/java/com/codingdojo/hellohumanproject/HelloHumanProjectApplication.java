package com.codingdojo.hellohumanproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloHumanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanProjectApplication.class, args);
	}
}
