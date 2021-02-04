package com.testingshastra.erp.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.QueryHint;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.testingshastra.erp.entity.Fees;
public interface StudentFessDao extends CrudRepository<Fees, Integer> {

	
	String feesByDuration = "from Fees where datePaid between ?1 and ?2";
	String StudentPendingFees = "from Fees where feesBalance > 0 ";
	public Fees getByDatePaid(Date date);
	
	//uery("from fees ") // (OR date>= ? AND date<=?)
	@Query(feesByDuration)
	public List<Fees> getByDateDuration(Date fromDate, Date toDate);

	@Query(StudentPendingFees)
	public List<Fees> getStudentsWithPendingFeesByBatchId();
	
}
