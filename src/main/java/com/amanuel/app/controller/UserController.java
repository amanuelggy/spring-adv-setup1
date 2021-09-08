package com.amanuel.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class UserController {

	@GetMapping("/api")
	public String user() {
		return "Hello world.";
	}
}
