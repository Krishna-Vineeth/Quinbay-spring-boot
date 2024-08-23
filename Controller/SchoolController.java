package com.example.postgrespringboot.Controller;

import com.example.postgrespringboot.DTO.SchoolDTO;
import com.example.postgrespringboot.DTO.StudentDTO;
import com.example.postgrespringboot.Service.SchoolService;
import com.example.postgrespringboot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/add")
    public void addSchool(@RequestBody SchoolDTO schoolDTO) {
        System.out.println(schoolDTO);
        schoolService.addSchool(schoolDTO);
    }

    @GetMapping("/get")
    public List<SchoolDTO> getAllSchools() {
        System.out.println("i am here");
        return schoolService.getAllSchools();
    }

    @GetMapping("/{rollNumber}")
    public SchoolDTO getStudent(@PathVariable String rollNumber) {
        return schoolService.getSchoolByRollNumber(rollNumber);
    }

//    @PutMapping("/{rollNumber}")
//    public void updateStudentName(@PathVariable String rollNumber, @RequestParam String newName) {
//        schoolService.updateSchoolName(rollNumber, newName);
//    }
//
//    @DeleteMapping("/{rollNumber}")
//    public void deleteStudent(@PathVariable String rollNumber) {
//        schoolService.deleteStudentByRollNumber(rollNumber);
//    }

}

