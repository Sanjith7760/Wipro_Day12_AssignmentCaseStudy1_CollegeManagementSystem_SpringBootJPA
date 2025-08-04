package com.example.collegemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanagement.entity.Course;
import com.example.collegemanagement.repository.CourseRepository;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;
	
	@PostMapping("/courses")
    public Course addCourse(@RequestBody Course c) {
        return courseRepository.save(c);
    }
 
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
 
    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable long id) {
        return courseRepository.findById(id);
    }
 
    @PutMapping("/courses/{id}")
    public Course updateCourse(@PathVariable long id, @RequestBody Course c) {
       // c.setId(id);
        return courseRepository.save(c);
    }
 
    @DeleteMapping("/courses/{id}")
    public String deleteCourse(@PathVariable long id) {
        courseRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
