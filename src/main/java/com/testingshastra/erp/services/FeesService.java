package com.testingshastra.erp.services;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import com.testingshastra.erp.entity.Fees;

@Service
public interface FeesService {

	public void payFees(Fees stdfees);
	public Fees getFeesByStudentId(int id);
	public Fees getFeesByDate(Date date);
	public List<Fees> getStudentsWithPendingFeesByBatchId();
	public List<Fees> getAllStudentFess();
	public List<Fees> getFeesByDuration(Date fromDate, Date toDate);
	public Object getStudentFessDetailsById(int sId);
	public List<Object> getStudentsDetailsWithPendingFees(); 
	 
}
