package com.testingshastra.erp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingshastra.erp.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	public List<Student> findByFirstName(String fname);

}
