package com.example.postgrespringboot.Service;

import com.example.postgrespringboot.DTO.SchoolDTO;
import com.example.postgrespringboot.DTO.StudentDTO;
import com.example.postgrespringboot.Model.School;
import com.example.postgrespringboot.Model.Student;
import com.example.postgrespringboot.Repository.SchoolRepository;
import com.example.postgrespringboot.Repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    public SchoolRepository schoolRepository;

    @Override
    public void addSchool(SchoolDTO schoolDTO) {
       School school = new School();
       BeanUtils.copyProperties(schoolDTO, school);
        System.out.println(school);
       schoolRepository.save(school);
    }


//    private Student convertToEntity(StudentDTO studentDTO) {
//        return new Student(
//                studentDTO.getName(),
//                studentDTO.getStudentClass(),
//                studentDTO.getRollNumber(),
//                studentDTO.getDob()
//        );
//    }


    @Override
    public List<SchoolDTO> getAllSchools() {
        List<School> schools = StreamSupport.stream(schoolRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return schools.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private SchoolDTO convertToDTO(School school) {
        SchoolDTO schoolDTO = new SchoolDTO();
        BeanUtils.copyProperties(school, schoolDTO);
        return schoolDTO;
    }


    @Override
    public SchoolDTO getSchoolByRollNumber(String rollNumber) {
        return null;
    }



    @Override
    public void updateSchoolName(String rollNumber, String newName) {

    }

    @Override
    public void deleteSchoolByRollNumber(String rollNumber) {

    }

//    @Override
//    public SchoolDTO getSchoolByRollNumber(String rollNumber) {
//        return null;
//    }
//
//    @Override
//    public void updateSchoolName(String rollNumber, String newName) {
//
//    }
//
//    @Override
//    public void deleteSchoolByRollNumber(String rollNumber) {
//
//    }
}
