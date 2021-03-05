package com.testingshastra.erp.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingshastra.erp.dao.CourseDao;
import com.testingshastra.erp.dto.CourseDTO;
import com.testingshastra.erp.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> courses;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {

	}

	@Override
	public List<CourseDTO> getCourses() {
		List<Course> courseList= courseDao.findAll();
		List<CourseDTO> courseDt=new ArrayList<>();
		for(Course c: courseList) {
			CourseDTO course = new CourseDTO();
			course.setName(c.getCourseName());
			course.setFees(c.getCourseFees());
			courseDt.add(course);
		}
		return courseDt;
	}

	@Override
	public Course getCourse(String courseId) {
		return courseDao.findById(Integer.parseInt(courseId)).orElse(null);
	}
	
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		System.out.println("Course Added successfully");
		return course;
	}

	@Override
	public void deleteCourse(String courseId) {
		Course course = courseDao.getOne(Integer.parseInt(courseId));
		courseDao.delete(course);
		
	}

	@Override
	public List<Course> getAllCourses() {
		return this.courseDao.findAll();
	}

}
