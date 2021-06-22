package com.example.data;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

                                                        //Type //Id
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
