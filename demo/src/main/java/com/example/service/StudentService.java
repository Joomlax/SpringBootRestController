package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.data.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
		//Error handling
		if(studentOptional.isPresent()){
			throw new IllegalStateException("email taken");
		}
		studentRepository.save(student);

	}

	public void deleteStudent(Long studentId) {
		boolean exist =studentRepository.existsById(studentId);
		if(!exist){
			throw new IllegalStateException("Student" + studentId+ "is not exist");
		}
		studentRepository.deleteById(studentId);

	}
}
