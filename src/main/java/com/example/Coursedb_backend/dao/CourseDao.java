package com.example.Coursedb_backend.dao;

import com.example.Coursedb_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {

    @Query(value = "SELECT `id`, `course_title`, `coursedate`, `coursedescription`, `courseduration`, `coursevenue`, `coursetitle` FROM `course` WHERE `coursetitle` LIKE %:coursetitle%",nativeQuery = true)
    List<Course> SearchCourse(@Param("coursetitle") String coursetitle);
}
