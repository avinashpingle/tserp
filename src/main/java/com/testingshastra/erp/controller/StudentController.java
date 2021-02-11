package com.testingshastra.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testingshastra.erp.entity.Student;
import com.testingshastra.erp.services.StudentService;
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(path = "/students", produces = "application/json")
	public List<Student> getStudents() {
		return this.studentService.getStudents();
	}
	
	@PostMapping(path="/students/addStudent")
	public void addStudent(@RequestBody Student student) {
		this.studentService.addStudent(student);
	}
	
	@GetMapping(path="/students/name/{studentName}", produces = "application/json")
	public List<Student> getStudentByName(@PathVariable String studentName) {
		return this.studentService.getStudent(studentName);
	}
	
	@GetMapping(path="/students/id/{id}", produces = "application/json")
	public Student getStudentById(@PathVariable Integer id) {
		return this.studentService.getStudent(id);
	}
}
