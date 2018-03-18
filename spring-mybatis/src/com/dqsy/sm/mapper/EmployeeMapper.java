package com.dqsy.sm.mapper;

import com.dqsy.sm.entity.Employee;

public interface EmployeeMapper {
	public Employee getEmployeeByIdLazyLoad(int empId);
}
