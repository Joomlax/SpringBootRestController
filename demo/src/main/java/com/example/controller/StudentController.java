package com.example.controller;
import java.util.List;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	public List<Student> getStudents() {
		return stuServ.getStudents();
	}

	@PostMapping
	public void registerNewStudent(@RequestBody Student student){
		stuServ.addNewStudent(student);
	}
}
