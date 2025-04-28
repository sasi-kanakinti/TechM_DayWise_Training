package com.aits.EmployeeDemo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.aits.EmployeeDemo.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
