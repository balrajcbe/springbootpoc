package com.balraj.boot.learn;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("hello")
	public String home() {
		return "Hello world";
	}
	
	@RequestMapping(value = "batman/{name}", method = RequestMethod.GET)
	public String batman(@PathVariable String name) {
		System.out.println("Received input: "+ name);
		return name;
	}

}
