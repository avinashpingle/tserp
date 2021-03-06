package com.testingshastra.erp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.testingshastra.erp.entity.Fees;
import com.testingshastra.erp.services.StudentFeesServiceImpl;

@RestController
public class FeesController {
	
	@Autowired
	private StudentFeesServiceImpl studentFeesService;

	@PostMapping(path = "students/addStudentFess")
	public void addFess(Fees sfees)
	{
		this.studentFeesService.payFees(sfees);
	}
	
	@GetMapping(path="students/fees/{id}", produces="application/json")
	public Fees getStudentFess(@PathVariable int id)
	{
		return this.studentFeesService.getFeesByStudentId(id);
	}
	
	@GetMapping(path="students/getAllFees", produces="application/json")
	public List<Fees> getAllFees()
	{
		return this.studentFeesService.getAllStudentFess();
	}
	
	@GetMapping(path="students/getFeesByDate/{datePaid}", produces="application/json")
	public Fees getFeesByDate(@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date datePaid) 
	{
		return this.studentFeesService.getFeesByDate(datePaid);
	}
	
	@GetMapping(path="students/getFeesByDuration/{fromDate}/{toDate}", produces="application/json")
	public List<Fees> getFeesByDuration(@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date fromDate, @PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date toDate) 
	{
		return this.studentFeesService.getFeesByDuration(fromDate, toDate);
	}
	
	@GetMapping(path="students/feesByStudentId/{id}", produces="application/json")
	public Object getStudentFessDetailsById(@PathVariable int id)
	{
		return this.studentFeesService.getStudentFessDetailsById(id);
	}
	
	@GetMapping(path="students/studentDetailsWithPendingFees", produces="application/json")
	public Object getStudentsDetailsWithPendingFees()
	{
		return this.studentFeesService.getStudentsDetailsWithPendingFees();
	}
}
