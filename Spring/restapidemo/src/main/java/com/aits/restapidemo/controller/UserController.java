package com.aits.restapidemo.controller;
 
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
 
import com.aits.restapidemo.User;
import com.aits.restapidemo.UserRepository;
 
@Controller
public class UserController {
	
	@Autowired
	UserRepository userrepository;
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public Optional<User> display(@PathVariable Long id) {
		
		return userrepository.findById(id);
		
	}
	
	
	@PostMapping("/users")
	@ResponseBody
	public User insert(@RequestBody User user) {
		
		userrepository.save(user);
		
		return user;
	}
	
	@PutMapping("/users/{id}")
	@ResponseBody
	public User update(@RequestBody User user,@PathVariable Long id) {
		
		
		if(userrepository.existsById(id)) {
			
		user.setId(id);
			userrepository.save(user);
			
			return user;
			
		}
		
		else {
			
			return null;
		}
		
		
	}
	
 
}
 
 