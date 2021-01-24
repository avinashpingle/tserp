package com.testingshastra.erp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fees {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int invoiceNo;
		private int amountPaid;
		private int feesBalance;
		public int getFeesBalance() {
			return feesBalance;
		}
		public void setFeesBalance(int feesBalance) {
			this.feesBalance = feesBalance;
		}
		private String datePaid;
		private int stdId;
		
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
		public String getDatePaid() {
			return datePaid;
		}
		public void setDatePaid(String datePaid) {
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
