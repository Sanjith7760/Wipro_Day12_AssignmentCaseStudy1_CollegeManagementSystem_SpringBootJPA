package com.example.collegemanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Student> students;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(Long id, String title, Department department, Instructor instructor, List<Student> students) {
		this.id = id;
		this.title = title;
		this.department = department;
		this.instructor = instructor;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
