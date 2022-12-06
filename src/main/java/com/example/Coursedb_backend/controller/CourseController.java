package com.example.Coursedb_backend.controller;

import com.example.Coursedb_backend.dao.CourseDao;
import com.example.Coursedb_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class CourseController {

    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcourse", consumes = "application/json", produces = "application/json")
    public String addcourse(@RequestBody Course c){

        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getCoursedescription().toString());
        System.out.println(c.getCoursevenue().toString());
        System.out.println(c.getCourseduration().toString());
        System.out.println(c.getCoursedate().toString());
        dao.save(c);
        return "course added Successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewcourse")
    public List<Course> viewcourse(){
        return (List<Course>) dao.findAll();
    }
}
