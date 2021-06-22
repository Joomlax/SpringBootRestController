package com.example.controller;
import java.util.ArrayList;

import com.example.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentService;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
	
	private final StudentService stuServ;
	
	@Autowired
	public StudentController(StudentService stuServ) {
		this.stuServ = stuServ;
	}
	@GetMapping
	public ArrayList<Student> getStudents() {
		return stuServ.getStudents();
	}
}
