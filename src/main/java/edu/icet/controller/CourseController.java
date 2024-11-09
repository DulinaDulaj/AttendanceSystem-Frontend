package edu.icet.controller;

import edu.icet.dto.Course;
import edu.icet.dto.Student;
import edu.icet.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
@CrossOrigin
public class CourseController {
    @Autowired
    final CourseService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCourse(@RequestBody Course course){
        service.addCourse(course);
    }

    @GetMapping("/get-course")
    public List<Course> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete-course/{cCode}")
    @ResponseStatus(HttpStatus.CREATED)
    public void deleteCourse(@PathVariable String cCode){
        service.deleteCourseById(cCode);
    }
}
