package com.example.collegemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanagement.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}
