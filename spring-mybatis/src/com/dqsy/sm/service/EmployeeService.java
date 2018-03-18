package com.dqsy.sm.service;

import java.util.List;

import com.dqsy.sm.entity.Employee;

public interface EmployeeService {
	/**
	 * 根据员工ID查员工信息
	 */
	public Employee getEmpByIdLazyLoad(int empId);
	/**
	 * 根据部门ID查员工信息
	 */
	public List<Employee> getEmpsBydeptIdLazyLoad(int deptId);
}
