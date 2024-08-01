package com.aws.dockerkubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String getMessage() {
		return "Welcome to SpringBoot demo on Aws Docker Kubernetes";
	}

}
