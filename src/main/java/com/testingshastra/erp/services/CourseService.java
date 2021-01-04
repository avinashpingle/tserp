package com.testingshastra.erp.services;

import java.util.List;

import com.testingshastra.erp.entity.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Course getCourse(String courseId);

	public Course addCourse(Course c);

	Course updateCourse(Course course);

	public void deleteCourse(String courseId);

}
