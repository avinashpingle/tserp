package com.testingshastra.erp.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingshastra.erp.dao.StudentFessDao;
import com.testingshastra.erp.entity.Fees;

@Service
public class StudentFessServiceImpl implements FeesService  {

	@Autowired
	StudentFessDao stdfessdao;
	
	
	@Override
	public Fees getFeesByStudentId(int id) {
		Fees stdfees = stdfessdao.findById(id).orElse(null);
		return stdfees;
	}


	@Override
	public List<Fees> getAllStudentFess() {

		return (List<Fees>) this.stdfessdao.findAll();
	}


	@Override
	public void payFees(Fees stdfees) 
	{
				stdfessdao.save(stdfees);
	}


	@Override
	public Fees getFeesByDate(Date date) 
	{
		return stdfessdao.getByDatePaid(date);
	}


	@Override
	public List<Fees> getFeesByDuration(Date fromDate, Date toDate) 
	{
		return  this.stdfessdao.getByDateDuration(fromDate, toDate);
		
	}


	@Override
	public List<Fees> getStudentsWithPendingFeesByBatchId(int batchId) {
		// TODO Auto-generated method stub
		return null;
	}



}
