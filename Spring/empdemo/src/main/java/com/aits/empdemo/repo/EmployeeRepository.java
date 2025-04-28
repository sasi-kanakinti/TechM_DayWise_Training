package com.aits.empdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.empdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
}
