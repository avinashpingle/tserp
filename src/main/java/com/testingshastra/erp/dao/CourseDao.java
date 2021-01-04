package com.testingshastra.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testingshastra.erp.entity.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{

}
