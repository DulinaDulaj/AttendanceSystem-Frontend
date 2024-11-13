package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Student> getAll() {
        List<Student> studentArray=new ArrayList<>();
        repository.findAll().forEach(entity-> {
           studentArray.add(mapper.map(entity,Student.class));
        });
        return studentArray;
    }

    @Override
    public void addStudent(Student student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }

    @Override
    public void deleteStudentById(String id) {
        repository.deleteById(id);
    }
    @Override
    public void updateStudentById(Student student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }

    public List<Student> findStudentsByNicContaining(String nic) {

        List<StudentEntity> studentEntities = repository.findByNicContaining(nic);


        return studentEntities.stream()
                .map(studentEntity -> mapper.map(studentEntity, Student.class))
                .collect(Collectors.toList());
    }
}
