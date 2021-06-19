package com.example.deneme;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
	@GetMapping
	public ArrayList<Student> getStudents() {
		ArrayList<Student> ac = new ArrayList<Student>();
		Student dogukan = new Student(1L,
					"Dogukan",
					21,
					LocalDate.of(1999,Month.SEPTEMBER,20),
					"dogukangulyasar@gmail.com"
					);
		ac.add(dogukan);
		return ac;
	}
}
