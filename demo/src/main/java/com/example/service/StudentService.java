package com.example.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.controller.Student;

@Service
public class StudentService {
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
