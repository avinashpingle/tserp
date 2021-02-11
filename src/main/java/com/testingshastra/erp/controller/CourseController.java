package com.testingshastra.erp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.testingshastra.erp.entity.Course;
import com.testingshastra.erp.services.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping(path="/courses/{courseId}", produces = "application/json")
	public Course getCourseService(@PathVariable String courseId) {
		return this.courseService.getCourse(courseId);
	}

	@PostMapping(path = "/courses", consumes = "application/json")
	public Course addCourse(@RequestBody Course c) {
		return this.courseService.addCourse(c);
	}

	@PutMapping(path = "/courses", consumes = "application/json")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		this.courseService.deleteCourse(courseId);
	}
	
	
}
