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

	@DeleteMapping(path="{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long studentId){
		stuServ.deleteStudent(studentId);
	}

	@PutMapping(path="{studentId}")
	public void updateStudent(
			@PathVariable("studentId") Long studentId,
			@RequestBody(required = false) String name,
			@RequestBody(required = false) String email){
		stuServ.updateStudent(studentId,name,email);
	}
}
