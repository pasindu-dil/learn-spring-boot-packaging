package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.model.Student;

public class StudentService {
    private static Map<Integer, Student> studentMap = new HashMap<>();

    static {
        Student student = new Student("Test", "000", "dsjkgf@gmail.com", "99166V");
        studentMap.put(studentMap.size(), student);

        Student student2 = new Student("Test 2", "0001", "dsjkgf@gmail.com", "99166V");
        studentMap.put(studentMap.size(), student2);
    }

    public static ArrayList<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    public static ArrayList<Student> addStudent(Student student) {
        studentMap.put(studentMap.size(), student);
        return new ArrayList<>(studentMap.values());
    }
}
