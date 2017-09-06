package com.balraj.boot.learn.Dao;

import org.springframework.data.repository.CrudRepository;

import com.balraj.boot.learn.model.School;

public interface SchoolRepository extends CrudRepository<School, String>{

}
