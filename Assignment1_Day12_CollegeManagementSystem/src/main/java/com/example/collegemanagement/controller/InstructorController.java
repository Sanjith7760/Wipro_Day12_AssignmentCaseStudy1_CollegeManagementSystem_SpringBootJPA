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

import com.example.collegemanagement.entity.Instructor;
import com.example.collegemanagement.repository.InstructorRepository;

@RestController
@RequestMapping("/api")
public class InstructorController {

	@Autowired
	private InstructorRepository instructorRepository;
	
	@PostMapping("/instructors")
    public Instructor addInstructor(@RequestBody Instructor i) {
        return instructorRepository.save(i);
    }
 
    @GetMapping("/instructors")
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }
 
    @GetMapping("/instructors/{id}")
    public Optional<Instructor> getInstructorById(@PathVariable long id) {
        return instructorRepository.findById(id);
    }
 
    @PutMapping("/instructors/{id}")
    public Instructor updateInstructor(@PathVariable long id, @RequestBody Instructor i) {
      //  i.setId(id);
        return instructorRepository.save(i);
    }
 
    @DeleteMapping("/instructors/{id}")
    public String deleteInstructor(@PathVariable long id) {
    	instructorRepository.deleteById(id);
    	return "Deleted Successfully";
    }
}
