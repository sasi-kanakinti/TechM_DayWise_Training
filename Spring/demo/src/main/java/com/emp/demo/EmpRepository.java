package com.emp.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Long> {
	
	Emp findByIdFirstName(String fname);
	<List>Emp findByIdDepartmrnt(String department);
	
}
