package com.example.postgrespringboot.DTO;

public class SchoolDTO {

    private Long id;

    private String name;

    private String dateOfEst;
    private String studentId;


    public SchoolDTO() {
    }

    public SchoolDTO(Long id, String name, String dateOfEst) {
        this.id = id;
        this.name = name;
        this.dateOfEst = dateOfEst;
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

    public String getDateOfEst() {
        return dateOfEst;
    }

    public void setDateOfEst(String dateOfEst) {
        this.dateOfEst = dateOfEst;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
