package com.example.config;

import com.example.data.StudentRepository;
import com.example.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
@EnableAutoConfiguration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args-> {
            Student dogukan = new Student(
                    "Dogukan",
                    LocalDate.of(1994, Month.SEPTEMBER,20),
                    "dogukangulyasar@gmail.com"
            );
            Student ahmet = new Student(
                    "Ahmet",
                    LocalDate.of(2001, Month.SEPTEMBER,30),
                    "ahmet@gmail.com"
            );

            repository.saveAll(
                    List.of(dogukan,ahmet)
            );
        };
    }
}
