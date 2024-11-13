package edu.icet.service;
import edu.icet.dto.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAll();
    void addCourse(Course course);
    void deleteCourseById(String cName);
}
