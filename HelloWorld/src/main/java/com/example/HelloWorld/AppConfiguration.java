package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfiguration {
	
@RequestMapping("/")
public String welcome() {
	return "Welcome to Spring Boot Application";
}


@RequestMapping("hello")
public String hello() {
	return "Hello World";
}
	

}
