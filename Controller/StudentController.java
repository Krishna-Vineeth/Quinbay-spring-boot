package com.example.postgrespringboot.Controller;

import com.example.postgrespringboot.DTO.StudentDTO;
import com.example.postgrespringboot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO) {
        studentService.addStudent(studentDTO);
    }

    @GetMapping("/get")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{rollNumber}")
    public StudentDTO getStudent(@PathVariable String rollNumber) {
        return studentService.getStudentByRollNumber(rollNumber);
    }

    @PutMapping("/{rollNumber}")
    public void updateStudentName(@PathVariable String rollNumber, @RequestParam String newName) {
        studentService.updateStudentName(rollNumber, newName);
    }

    @DeleteMapping("/{rollNumber}")
    public void deleteStudent(@PathVariable String rollNumber) {
        studentService.deleteStudentByRollNumber(rollNumber);
    }
}
