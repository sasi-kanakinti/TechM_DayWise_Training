package com.emp.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emp.demo.Emp;
import com.emp.demo.EmpRepository;

@Controller
public class UserController {
	
	@Autowired
	EmpRepository emprepository;
	
	@GetMapping("/emp/{id}")
	@ResponseBody
	public Optional<Emp> display(@PathVariable Long id)
	{
		return emprepository.findById(id);
	}
	
	@PostMapping("/emp")
	@ResponseBody
	public Emp insert(@RequestBody Emp emp)
	{
		emprepository.save(emp);
		return emp;
	}
	
	@PutMapping("/emp/{id}")
	@ResponseBody
	public Emp update(@RequestBody Emp emp,@PathVariable Long id)
	{
		if(emprepository.existsById(id)) {
			emp.setId(id);
			emprepository.save(emp);
			return emp;
		}
		
		else {
			return null;
		}
	}
	
	@DeleteMapping("/emp/{id}")
	@ResponseBody
	public Emp delete(@RequestBody Emp emp,@PathVariable Long id)
	{
		if(emprepository.existsById(id)) {
			emp.setId(id);
			emprepository.delete(emp);
			return emp;
		}
		else
		{
			return null;
		}
	}
}
