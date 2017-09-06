package com.balraj.boot.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balraj.boot.learn.Dao.SchoolRepository;
import com.balraj.boot.learn.model.School;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository repository;
	
	public School createSchoolEntry(School school) {
		repository.save(school);
		return school;
	}
	
	public School findSchool(String regNo) {
		return repository.findOne(regNo);
	}
}
