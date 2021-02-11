package com.testingshastra.erp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingshastra.erp.dao.StudentDao;
import com.testingshastra.erp.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public List<Student> getStudent(String name) {
		return studentDao.findByFirstName(name);
	}

	@Override
	public Student getStudent(int id) {
		return studentDao.findById(id).orElse(null);
	}

}
