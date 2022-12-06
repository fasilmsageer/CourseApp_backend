package com.example.Coursedb_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")

public class Course {

    @Id
    @GeneratedValue()

    private int id;
    private String coursetitle;
    private String coursedescription;
    private String coursevenue;
    private String courseduration;
    private String coursedate;

    public Course(){}

    public Course(int id, String coursetitle, String coursedescription, String coursevenue, String courseduration, String coursedate) {
        this.id = id;
        this.coursetitle = coursetitle;
        this.coursedescription = coursedescription;
        this.coursevenue = coursevenue;
        this.courseduration = courseduration;
        this.coursedate = coursedate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }

    public String getCoursevenue() {
        return coursevenue;
    }

    public void setCoursevenue(String coursevenue) {
        this.coursevenue = coursevenue;
    }

    public String getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(String courseduration) {
        this.courseduration = courseduration;
    }

    public String getCoursedate() {
        return coursedate;
    }

    public void setCoursedate(String coursedate) {
        this.coursedate = coursedate;
    }
}
