package com.balraj.boot.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.balraj.boot.learn.model.School;
import com.balraj.boot.learn.service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping("hello")
	public String home() {
		return "Hello world";
	}
	
	@RequestMapping(value = "getschool/{id}", method = RequestMethod.GET)
	public School getSchool(@PathVariable String id) {
		System.out.println("Received input: "+ id);
		return schoolService.findSchool(id);
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public School createSchoolEntry(@RequestBody School school) {
		System.out.println(school);
		return schoolService.createSchoolEntry(school);
	}

}
