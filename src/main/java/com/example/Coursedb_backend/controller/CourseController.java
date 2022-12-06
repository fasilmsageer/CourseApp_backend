package com.example.Coursedb_backend.controller;

import com.example.Coursedb_backend.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {

    @PostMapping(path = "/addcourse", consumes = "application/json", produces = "application/json")
    public String addcourse(@RequestBody Course c){

        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getCoursedescription().toString());
        System.out.println(c.getCoursevenue().toString());
        System.out.println(c.getCourseduration().toString());
        System.out.println(c.getCoursedate().toString());


        return "course added Successfully";
    }
}
