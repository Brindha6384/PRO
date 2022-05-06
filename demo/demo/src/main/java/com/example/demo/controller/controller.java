package com.example.demo.controller;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api/v1")
public class controller {









	@Autowired
	public Repository repo;
	
	@PostMapping("addTodo")
	public Model addTodo(@RequestBody Model todo) {
		return repo.save(todo);
	}
	
	@GetMapping("getTodo")
	public List<Model> getTodo(){
		return repo.findAllByOrderByIdAsc();
	}
	
	@GetMapping("getTodoById/{id}")
	public Model getTodoById(@PathVariable int id){
		return repo.findById(id).orElse(null);
	}
	
	
	@DeleteMapping("deleteTodo/{id}")
	public String deleteTodo(@PathVariable int id) {
		repo.deleteById(id);
		return "Todo Deleted";
	}
	
	@PutMapping("updateTodo/{id}")
	public  Model updateTodo(@RequestBody Model todo) {
		Model existingTodo = repo.findByTasktodo(todo.getTasktodo()).orElse(todo);
		existingTodo.setTodoname(todo.getTodoname());
		existingTodo.setDesc(todo.getDesc());
		existingTodo.setStatus(todo.get());
		return repo.save(existingTodo);
	}

}