package com.example.demo.model;

public class Student {
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String nic;

    public Student(String name, String mobile, String email, String nic) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.nic = nic;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
