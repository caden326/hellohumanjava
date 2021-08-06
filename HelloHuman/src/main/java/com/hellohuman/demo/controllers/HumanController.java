package com.hellohuman.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping("/{name}")
	public String showString(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
}
