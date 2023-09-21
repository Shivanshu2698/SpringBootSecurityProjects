package com.springboot.test.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@GetMapping("/hello")
	public String sayHelo() {
		return "Hii!! this Spring Boot app implements default security provided by SpringBoot";
	}

}
