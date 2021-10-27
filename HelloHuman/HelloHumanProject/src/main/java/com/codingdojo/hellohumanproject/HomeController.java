package com.codingdojo.hellohumanproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/my_server")
public class HomeController {
	@RequestMapping(value="", method= RequestMethod.GET)
	public String helloHuman() {
		return "<h1>" + "Hello Human!" + "</h1>" + "Welcome to Spring Boot!";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String helloName(@RequestParam(value="name", required=false) String searchQuery,
		@RequestParam(value="last_name", required=false) String searchQuery2) {
		String sayHello = "<h1>"+"Hello " + searchQuery + " " + searchQuery2 + "!" + "</h1>";
		String goBack = "<br> <br> <a href='/my_server'>Go Back</a>";
		return sayHello + "Welcome to Spring Boot!" + goBack;
	}
}
