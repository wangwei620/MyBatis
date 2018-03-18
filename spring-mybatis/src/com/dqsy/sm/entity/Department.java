package com.dqsy.sm.entity;

import java.util.List;

public class Department implements java.io.Serializable{
	/**
	 * 添加序列化
	 */
	private static final long serialVersionUID = 1L;
	private int deptId;
	private String deptName;
	private List<Employee> emps;
	public int getDeptId() {
		return deptId;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emps=" + emps + "]";
	}
	
}
