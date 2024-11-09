package edu.icet.repository;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity,String> {


}
