package edu.icet.service;
import edu.icet.dto.Course;
import edu.icet.entity.CourseEntity;
import edu.icet.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Course> getAll() {
        List<Course> courseArray=new ArrayList<>();
        repository.findAll().forEach(entity-> {
            courseArray.add(mapper.map(entity,Course.class));
        });
        return courseArray;
    }

    @Override
    public void addCourse(Course course) {
        repository.save(mapper.map(course, CourseEntity.class));
    }

    @Override
    public void deleteCourseById(String cCode) {
        repository.deleteById(cCode);
    }
}
