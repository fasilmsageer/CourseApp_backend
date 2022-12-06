package com.example.Coursedb_backend.dao;

import com.example.Coursedb_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
