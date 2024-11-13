package edu.icet.controller;

import edu.icet.dto.Course;
import edu.icet.dto.Student;
import edu.icet.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
@CrossOrigin

public class CourseController {

    final CourseService service;

    @PostMapping
    public void addCourse(@RequestBody Course course){
        System.out.println(course);
        service.addCourse(course);
    }

    @GetMapping("/get-courses")
    public List<Course> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete-course/{c_code}")
    @ResponseStatus(HttpStatus.CREATED)
    public void deleteCourse(@PathVariable String c_code){
        service.deleteCourseById(c_code);
    }
}
