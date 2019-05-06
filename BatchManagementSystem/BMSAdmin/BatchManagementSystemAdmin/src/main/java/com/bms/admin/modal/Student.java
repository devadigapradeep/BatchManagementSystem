package com.bms.admin.modal;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
		private Long studentId;
		private String studentRegNo;
		private String name;
		private String mobileNo;
		private BigDecimal studentActualAmt;
		private BigDecimal studentPaidAmt;
		private Character feesCleared;
		private Short status;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="student_id",updatable=false,nullable = false)
		public Long getStudentId() {
			return studentId;
		}
		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}
		
		@Column(name="student_reg_no",length=20)
		public String getStudentRegNo() {
			return studentRegNo;
		}
		public void setStudentRegNo(String studentRegNo) {
			this.studentRegNo = studentRegNo;
		}
		
		@Column(name="name",length=100)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Column(name="mobile_no",length=15)
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		
		@Column(name="student_actual_amt",precision=50)
		public BigDecimal getStudentActualAmt() {
			return studentActualAmt;
		}
		public void setStudentActualAmt(BigDecimal studentActualAmt) {
			this.studentActualAmt = studentActualAmt;
		}
		
		@Column(name="student_paid_amt",precision=50)
		public BigDecimal getStudentPaidAmt() {
			return studentPaidAmt;
		}
		public void setStudentPaidAmt(BigDecimal studentPaidAmt) {
			this.studentPaidAmt = studentPaidAmt;
		}
		
		@Column(name="fees_cleared",length=1)
		public Character getFeesCleared() {
			return feesCleared;
		}
		public void setFeesCleared(Character feesCleared) {
			this.feesCleared = feesCleared;
		}
		
		@Column(name="status",length=1)
		public Short getStatus() {
			return status;
		}
		public void setStatus(Short status) {
			this.status = status;
		}
		
}
