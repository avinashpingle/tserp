package com.testingshastra.erp.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.testingshastra.erp.entity.Fees;
public interface StudentFessDao extends CrudRepository<Fees, Integer> {

	
	public Fees getByDatePaid(Date date);
	
	@Query("Select * from fess where date between ? and ?") // (OR date>= ? AND date<=?)
	public List<Fees> getByDateDuration(Date fromDate, Date toDate);
	
//	public List<Fees> getStudentsWithPendingFeesByBatchId(int batchId);
	
}
