package com.dqsy.sm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dqsy.sm.entity.Employee;
import com.dqsy.sm.service.EmployeeService;

public class SpringMyBatisTest {
	private ApplicationContext ctx = null;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void Test(){
		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
		Employee emp = employeeService.getEmpByIdLazyLoad(40);
		System.out.println(emp);
	}
}
