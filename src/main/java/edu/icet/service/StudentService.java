package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    void addStudent(Student student);
    void deleteStudentById(String name);
    void updateStudentById(Student student);
}
