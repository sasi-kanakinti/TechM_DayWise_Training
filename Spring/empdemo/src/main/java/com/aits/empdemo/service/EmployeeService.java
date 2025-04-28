package com.aits.empdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.empdemo.entity.Employee;
import com.aits.empdemo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		
		employeeRepository.save(emp);
	}

	
	//Business Logic
	
	
}
