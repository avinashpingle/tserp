package com.testingshastra.erp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testingshastra.erp.entity.Student;

@Service
public interface StudentService {
	public List<Student> getStudents();
	public Student addStudent(Student student);
	public List<Student> getStudent(String name);
	public Student getStudent(int id);

}
