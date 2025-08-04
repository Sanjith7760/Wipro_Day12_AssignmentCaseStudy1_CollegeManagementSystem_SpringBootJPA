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

import com.example.collegemanagement.entity.Department;
import com.example.collegemanagement.repository.DepartmentRepository;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping("/departments")
	public Department addDepartment(@RequestBody Department d) {
		return departmentRepository.save(d);
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments(){
		return departmentRepository.findAll();
	}
	
	@GetMapping("/departments/{id}")
	public Optional<Department> getDepartmentById(@PathVariable long id){
		return departmentRepository.findById(id);
	}
	
	@PutMapping("departments/{id}")
	public Department updateDepartment(@PathVariable long id, @RequestBody Department d) {
		return departmentRepository.save(d);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartment(@PathVariable Long id) {
		departmentRepository.deleteById(id);
		return "Deleted Successfully";
	}
	
}
