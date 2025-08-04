package com.example.collegemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
