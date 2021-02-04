package com.testingshastra.erp.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Fees {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int invoiceNo;
		private int amountPaid;
		private int feesBalance;
		
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date datePaid;
		
		private int stdId;
		
		
		public int getFeesBalance() {
			return feesBalance;
		}
		public void setFeesBalance(int feesBalance) {
			this.feesBalance = feesBalance;
		}
		public int getInvoiceNo() {
			return invoiceNo;
		}
		public void setInvoiceNo(int invoiceNo) {
			this.invoiceNo = invoiceNo;
		}
		public int getAmountPaid() {
			return amountPaid;
		}
		public void setAmountPaid(int amountPaid) {
			this.amountPaid = amountPaid;
		}
		public Date getDatePaid() {
			return datePaid;
		}
		public void setDatePaid(Date datePaid) {
			this.datePaid = datePaid;
		}
		public int getStdId() {
			return stdId;
		}
		public void setStdId(int stdId) {
			this.stdId = stdId;
		}
		@Override
		public String toString() {
			return "Fees [invoiceNo=" + invoiceNo + ", amountPaid=" + amountPaid + ", feesBalance=" + feesBalance
					+ ", datePaid=" + datePaid + ", stdId=" + stdId + "]";
		}
		
		
		
	
}
