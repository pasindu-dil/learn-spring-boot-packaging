package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(value = "/api/v1/student")
@CrossOrigin
public class StudentController {
    @GetMapping(value = "/get-student")
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();
    }

    @PostMapping(value = "/add-student")
    public List<Student> addStudent(@RequestBody Student student){
        return StudentService.addStudent(student);
    }
}
