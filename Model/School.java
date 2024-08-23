package com.example.postgrespringboot.Model;

import javax.persistence.*;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dateOfEst;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateOfEst() {
        return dateOfEst;
    }

    public void setDateOfEst(String dateOfEst) {
        this.dateOfEst = dateOfEst;
    }
}
