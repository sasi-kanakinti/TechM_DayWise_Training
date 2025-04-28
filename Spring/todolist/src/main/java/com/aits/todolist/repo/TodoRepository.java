package com.aits.todolist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.todolist.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	Todo findByStatus(boolean status);
}
