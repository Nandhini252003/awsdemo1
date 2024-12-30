package com.example.first_jar_api.collector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCollector {

	@GetMapping("/")
	public String sayHello() {
		return "<font color-green size=20>My Hello</font>";
	}
}
