package com.example.StudentBackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="student")
public class StudentsModel {
    @Id
    @GeneratedValue
    private int id;
    private int rollno;
    private String name;
    private String clg;

    public StudentsModel() {
    }

    public StudentsModel(int id, int rollno, String name, String clg) {
        this.id = id;
        this.rollno = rollno;
        this.name = name;
        this.clg = clg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }
}
