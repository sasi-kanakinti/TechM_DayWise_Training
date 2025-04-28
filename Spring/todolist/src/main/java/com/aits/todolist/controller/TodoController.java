package com.aits.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.todolist.Todo;
import com.aits.todolist.repo.TodoRepository;
import com.aits.todolist.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	@Autowired
	TodoRepository todorepository;
	
	
	@PostMapping
	public ResponseEntity<Todo> insert(@RequestBody Todo todo)
	{
		
		//TodoService.insert(todo);
		return new ResponseEntity<>(todo,HttpStatus.CREATED);
		
	}
	
//	@GetMapping
//	public ResponseEntity<List<Todo>>getAllTodos() {
//		
//		//List<Todo> todos=TodoService.getAllTodos();
//		//return new ResponseEntity<>(todos,HttpStatus.OK);
//		
//	
//	}
	
	@PutMapping("/{id}")
	public Todo update(@RequestBody Todo todo,@PathVariable long id){
		if(todorepository.existsById(id)) {
			todo.setId(id);;
			todorepository.save(todo);
			return todo;
		}
		else {
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public Todo delete(@RequestBody Todo todo,@PathVariable long id)
	{
		if(todorepository.existsById(id)) {
			todo.setId(id);
			todorepository.delete(todo);
			return todo;
		}
		else {
			return null;
		}
	}
}
