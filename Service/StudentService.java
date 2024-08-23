package com.example.postgrespringboot.Service;

import com.example.postgrespringboot.DTO.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO studentDTO);
    List<StudentDTO> getAllStudents();
    StudentDTO getStudentByRollNumber(String rollNumber);
    void updateStudentName(String rollNumber, String newName);
    void deleteStudentByRollNumber(String rollNumber);
}

