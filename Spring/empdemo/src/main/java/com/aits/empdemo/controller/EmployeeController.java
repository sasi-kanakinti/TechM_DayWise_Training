package com.aits.empdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aits.empdemo.entity.Employee;
import com.aits.empdemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> insert(@RequestBody Employee emp)
	{
		
		employeeService.insert(emp);
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
	
	}
	
	
}
