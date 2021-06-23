package com.example.data;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Type //Id
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //SELECT * FROM student WHERE email=?
                          //Student class
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
