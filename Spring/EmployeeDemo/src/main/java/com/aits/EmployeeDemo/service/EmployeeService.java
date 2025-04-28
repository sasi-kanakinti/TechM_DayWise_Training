package com.aits.EmployeeDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.EmployeeDemo.Entity.Employee;
import com.aits.EmployeeDemo.exception.ABCD;
import com.aits.EmployeeDemo.exception.EmployeeNotFound;
import com.aits.EmployeeDemo.exception.HighHikeException;
import com.aits.EmployeeDemo.repo.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service // does not have any extra login, but represents the business logic and create object also
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository; 
	
	@Transactional// database operation avoids ACID properties then throw exception
	public Employee insert(Employee emp) {

		return employeeRepository.save(emp);
		
	}

	public Employee updateSalary(double hike, int id) {
		
		// the condition is salary is should not be hiked more than 1000
		// possible exceptions -> i might not exist ->
		// i might increase the salary more than 1000 -> throw exception
		
		Employee emp = employeeRepository.findById(id)
				.orElseThrow( ()-> new EmployeeNotFound("Employee not found..."))
				;
		if(hike<500)
			throw new ABCD("Hike price should be greater than 500");
		if(hike>1000)
			throw new HighHikeException("Hike price should be less than 1000");
		emp.setSalary(emp.getSalary()+hike);
		return emp;
		
		
		//Controller->Service->repository->Database
	}

}
