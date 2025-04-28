package com.aits.EmployeeDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private double salary;
	
	public Employee() {}
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
/*package com.aits.employeedemoo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.aits.employeedemoo.entity.Employee;
import com.aits.employeedemoo.service.EmployeeService;
 
@RestController
public class EmployeeController {
 
	
	//this class should communicate to service..service
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> insert(@RequestBody Employee emp){
		
		//send the object to service layer
		
		employeeService.insert(emp);
		
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
		
		
	}
	
	@PutMapping("employees/{id}")
	public ResponseEntity<Employee> updateSal(@RequestParam double hike,@PathVariable int id){
		
		
		  Employee emp=employeeService.updateSalary(hike,id);
		  
		  return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
}
 
 
package com.aits.employeedemoo.exception;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
 
@ControllerAdvice
public class GlobalExceptionHandler {
 
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> handleEmployeeNotFound(EmployeeNotFound e){
		
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(HikeisInvalidException.class)
public ResponseEntity<String> handleEmployeeNotFound(HikeisInvalidException e){
		
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
}
 
 
package com.aits.employeedemoo.service;
 
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.aits.employeedemoo.entity.Employee;
import com.aits.employeedemoo.exception.EmployeeNotFound;
import com.aits.employeedemoo.exception.HikeisInvalidException;
import com.aits.employeedemoo.repo.EmployeeRepository;
 
import jakarta.transaction.Transactional;
 
 
 
@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
 
	
	public void insert(Employee emp) {
		
		
		//db operation
		employeeRepository.save(emp);
		
		
		
		
		
		
	}
 
 
	@Transactional
	public Employee updateSalary(double hike,int id){
		
		
		  
		// condition is salary should not be hiked more than 1000
		
		//possible exceptions -> id might not exists -> I have to actually throw an exception
		
		// i might Increase the salary more than hike > 1000 -> exceptions
		
	
		
		       Employee emp=employeeRepository.findById(id).orElseThrow(
		    		   
		    		       ()->new EmployeeNotFound("emp not found"));
		    		   
		    		   
		    		         
		       
		
		       
		       if ( hike > 1000) {
		    	   
		    	   throw new HikeisInvalidException("Hike is not Valid");
		       }
	
	            emp.setSalary(emp.getSalary()+hike);
	            
	            employeeRepository.save(emp);
	            
	            return emp;
	            
	}
}
	
	
	            
	            
		
		
		
		       
		       
		       
		      
		       
		       
		        
		           
		
		
	
	
	
 
	
	
	
 
	
	
	
 
 
 
package com.aits.employeedemoo.exception;
 
public class EmployeeNotFound extends RuntimeException {
 
	
	
	
	public EmployeeNotFound(String message) {
		
		super(message);
	}
	
}
 
 
package com.aits.employeedemoo.exception;
 
public class HikeisInvalidException extends RuntimeException {
 
	
	public HikeisInvalidException(String message) {
		
		super(message);
	}
}
 
 */
