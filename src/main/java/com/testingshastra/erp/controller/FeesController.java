package com.testingshastra.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testingshastra.erp.entity.Fees;
import com.testingshastra.erp.services.StudentFessServiceImpl;

@RestController
public class FeesController {
	
	@Autowired
	private StudentFessServiceImpl studentFessService;

	@PostMapping(path = "students/addStudentFess")
	public void addFess(Fees sfees)
	{
		this.studentFessService.payFees(sfees);
	}
	
	@GetMapping(path="students/fees/{id}", produces="application/json")
	public Fees getStudentFess(@PathVariable int id)
	{
		return this.studentFessService.getFeesByStudentId(id);
	}
	
	@GetMapping(path="students/getAllFees", produces="application/json")
	public List<Fees> getAllFees()
	{
		return this.studentFessService.getAllStudentFess();
	}
	

}
