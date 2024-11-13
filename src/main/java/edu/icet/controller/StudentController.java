package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin


public class StudentController {

    @Autowired
    final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @PostMapping("/update-student")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateStudent(@RequestBody Student student){
        service.updateStudentById(student);
    }


    @GetMapping("/get-students")
    public List<Student> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete-student/{nic}")
    @ResponseStatus(HttpStatus.CREATED)
    public void deleteStudent(@PathVariable String nic){
        service.deleteStudentById(nic);
    }

    @GetMapping("/search/{nic}")
    public List<Student> searchStudents(@PathVariable("nic") String nic) {
        return service.findStudentsByNicContaining(nic);
    }

}
