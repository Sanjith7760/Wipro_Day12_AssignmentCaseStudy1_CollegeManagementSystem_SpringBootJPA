package com.example.collegemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
