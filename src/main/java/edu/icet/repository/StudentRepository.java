package edu.icet.repository;
import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,String> {
    List<StudentEntity> findByNicContaining(String nic);
}
