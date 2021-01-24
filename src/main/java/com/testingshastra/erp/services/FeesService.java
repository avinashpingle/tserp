package com.testingshastra.erp.services;

import java.util.Date;
import java.util.List;


import com.testingshastra.erp.entity.Fees;


public interface FeesService {

	public void payFees(Fees stdfees);
	public Fees getFeesByStudentId(int id);
	public Fees getFeesByDate(Date date);
	public List<Fees> getStudentsWithPendingFeesByBatchId(int batchId);
	public List<Fees> getAllStudentFess();
	public List<Fees> getFeesByDuration(Date fromDate, Date toDate);
	 
}