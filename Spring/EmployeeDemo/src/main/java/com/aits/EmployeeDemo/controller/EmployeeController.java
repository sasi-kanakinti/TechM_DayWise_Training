package com.aits.EmployeeDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aits.EmployeeDemo.Entity.Employee;
import com.aits.EmployeeDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	// this class should communicate to the service .. service
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> insert(@RequestBody Employee emp)
	{
		// send the object to service layer
		
		employeeService.insert(emp);
		
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	
	@PutMapping("employee/{id}")
	public Employee updateSal(@RequestParam double hike,@PathVariable int id)
	{
		Employee emp =  employeeService.updateSalary(hike,id);
		return emp;
	}

}
