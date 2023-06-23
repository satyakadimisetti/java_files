package com.example.springboot.oracle1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class CoarseController {
    @Autowired
    private CourseRepost courseRepost;
    @PostMapping ("/course")
    public Course saveCourse(@RequestBody Course course){
        return courseRepost.save(course);
    }
    @GetMapping("/getcourse")
    public List<Course> getCourse(){
        return courseRepost.findAll();
    }
}
