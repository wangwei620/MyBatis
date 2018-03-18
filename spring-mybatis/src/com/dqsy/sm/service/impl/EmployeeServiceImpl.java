package com.dqsy.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dqsy.sm.entity.Employee;
import com.dqsy.sm.mapper.EmployeeMapper;
import com.dqsy.sm.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public Employee getEmpByIdLazyLoad(int empId) {
		// TODO Auto-generated method stub
		return employeeMapper.getEmployeeByIdLazyLoad(empId);
	}

	@Override
	public List<Employee> getEmpsBydeptIdLazyLoad(int deptId) {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeMapper.getEmployeeByIdLazyLoad(deptId);
	}

}
