
package com.example.postgrespringboot.DTO;

import java.time.LocalDate;

public class StudentDTO {
    private Long id;
    private String name;
    private String studentClass;
    private String rollNumber;
    private LocalDate dob;
    private String SchoolId;


    public StudentDTO() {}

    public StudentDTO(Long id, String name, String studentClass, String rollNumber, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
        this.rollNumber = rollNumber;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getSchoolId() {
        return SchoolId;
    }

    public void setSchoolId(String schoolId) {
        SchoolId = schoolId;
    }
}

