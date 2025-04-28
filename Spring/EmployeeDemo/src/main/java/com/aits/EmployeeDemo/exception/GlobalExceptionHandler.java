package com.aits.EmployeeDemo.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.aits.EmployeeDemo.Entity.Employee;
import com.aits.EmployeeDemo.service.EmployeeService;

@ControllerAdvice
public class GlobalExceptionHandler {
	@Autowired
	EmployeeService employeeService;
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> handleEmployeeNotFound(EmployeeNotFound e)
	{
		
		return new ResponseEntity<> (e.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(HighHikeException.class)
	public ResponseEntity<String> handleHikeValue(HighHikeException h)
	{	
	
		return new ResponseEntity<>(h.getMessage(),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ABCD.class)
	public ResponseEntity<String> abcd(ABCD a)
	{
		return new ResponseEntity<>(a.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
