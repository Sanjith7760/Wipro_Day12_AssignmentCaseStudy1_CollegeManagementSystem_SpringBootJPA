package com.example.collegemanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Course> courses;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(Long id, String name, List<Course> courses) {
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
