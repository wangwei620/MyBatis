package com.dqsy.sm.entity;

import java.math.BigDecimal;

public class Employee implements java.io.Serializable{
	/**
	 * 添加序列化,防止在高并发的时候出现错误,无法查找
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private String gender;
	private String email;
	private BigDecimal salary;
	private String jobTitle;
	private int deptId;
	private Department dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", email=" + email
				+ ", salary=" + salary + ", jobTitle=" + jobTitle + ", deptId=" + deptId + ", dept=" + dept + "]";
	}

}
