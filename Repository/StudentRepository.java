package com.example.postgrespringboot.Repository;

import com.example.postgrespringboot.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByRollNumber(String rollNumber);
}