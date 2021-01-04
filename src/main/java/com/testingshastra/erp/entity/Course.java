package com.testingshastra.erp.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String courseName;
	private float courseFees;
	
	public Course(int id, String courseName, float courseFees) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseFees = courseFees;
	}

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public float getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(float courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}
	

}
