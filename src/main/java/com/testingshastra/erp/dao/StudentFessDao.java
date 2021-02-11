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
	String StudentPendingFees = "select s.firstName, s.lastName, f.feesBalance from Student s INNER JOIN Fees f ON s.id = f.stdId  where f.feesBalance > 0 ";
	String StudentsDetailsWithPendingFees = "select s.firstName, s.lastName, f.feesBalance from Student s INNER JOIN Fees f ON s.id = f.stdId  where f.feesBalance > 0 ";
	String studentFessDeailsById = "select s.firstName, s.lastName, f.feesBalance from Student s INNER JOIN Fees f ON s.id = f.stdId where s.id = ?1";
	public Fees getByDatePaid(Date date);
	
	//uery("from fees ") // (OR date>= ? AND date<=?)
	@Query(feesByDuration)
	public List<Fees> getByDateDuration(Date fromDate, Date toDate);

	@Query(StudentPendingFees)
	public List<Fees> getStudentsWithPendingFeesByBatchId();
	
	@Query(studentFessDeailsById)
	public Object getStudentFessDetailsById(int sId);
	//public List<Object> getStudentFessDetailsById(int sId);
	
	@Query(StudentsDetailsWithPendingFees)
	public List<Object> getStudentsDetailsWithPendingFees(); 
}
