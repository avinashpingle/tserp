package com.testingshastra.erp.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testingshastra.erp.dao.StudentFeesDao;
import com.testingshastra.erp.entity.Fees;

@Service
public class StudentFeesServiceImpl implements FeesService  {

	@Autowired
	StudentFeesDao stdfeesdao;
	
	
	@Override
	public Fees getFeesByStudentId(int id) {
		Fees stdfees = stdfeesdao.findById(id).orElse(null);
		return stdfees;
	}


	@Override
	public List<Fees> getAllStudentFess() {

		return (List<Fees>) this.stdfeesdao.findAll();
	}


	@Override
	public void payFees(Fees stdfees) 
	{
		stdfeesdao.save(stdfees);
	}


	@Override
	public Fees getFeesByDate(Date date) 
	{
		return stdfeesdao.getByDatePaid(date);
	}


	@Override
	public List<Fees> getFeesByDuration(Date fromDate, Date toDate) 
	{
		return this.stdfeesdao.getByDateDuration(fromDate, toDate);
		
	}


	@Override
	public List<Fees> getStudentsWithPendingFeesByBatchId() {
		return this.stdfeesdao.getStudentsWithPendingFeesByBatchId();
	}


	@Override
	public Object getStudentFessDetailsById(int sId) {
		
		return this.stdfeesdao.getStudentFessDetailsById(sId);
	}


	@Override
	public List<Object> getStudentsDetailsWithPendingFees() {
		return this.stdfeesdao.getStudentsDetailsWithPendingFees();
	}



}
