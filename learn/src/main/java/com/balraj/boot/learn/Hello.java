package com.balraj.boot.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("hello")
	public String home() {
		return "Hello world";
	}

}
