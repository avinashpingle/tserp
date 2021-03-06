package com.testingshastra.erp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.testingshastra.erp.dto.CourseDTO;
import com.testingshastra.erp.entity.Course;

@Service
public interface CourseService {
	public List<CourseDTO> getCourses();

	public Course getCourse(String courseId);

	public Course addCourse(Course c);

	public Course updateCourse(Course course);

	public void deleteCourse(String courseId);
	public List<Course> getAllCourses();
	

}
