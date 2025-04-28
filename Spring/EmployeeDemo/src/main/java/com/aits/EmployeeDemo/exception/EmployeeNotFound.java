package com.aits.EmployeeDemo.exception;


@SuppressWarnings("serial")
public class EmployeeNotFound extends RuntimeException{

	public EmployeeNotFound(String message)
	{
		super(message);
	}
	
}
