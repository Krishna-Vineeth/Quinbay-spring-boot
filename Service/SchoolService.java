package com.example.postgrespringboot.Service;

import com.example.postgrespringboot.DTO.SchoolDTO;
import com.example.postgrespringboot.DTO.StudentDTO;
import com.example.postgrespringboot.Model.School;

import java.util.List;

public interface SchoolService {
    public void addSchool(SchoolDTO schoolDTO);

    List<SchoolDTO> getAllSchools();
    SchoolDTO getSchoolByRollNumber(String rollNumber);
    void updateSchoolName(String rollNumber, String newName);
    void deleteSchoolByRollNumber(String rollNumber);
}

