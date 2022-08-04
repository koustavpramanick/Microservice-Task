package com.task.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.model.EmployeePojo;

@Service
class MsDay1TaskKoustavApplicationService implements InitializingBean {
	@Autowired
	EmployeePojo employee;

	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee Name: " + employee.getName());

	}
	 
	/*
	 * public void method() {
	 * System.out.println("Employee Name: "+employee.getName()); }
	 */
	

}
