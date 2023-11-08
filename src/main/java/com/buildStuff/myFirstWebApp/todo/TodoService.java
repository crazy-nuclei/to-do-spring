package com.buildStuff.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 0;
	
	static {
		todos.add(new Todo(++todoCount, "AA", "Learn OS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "AA", "Learn CN", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todoCount, "AA", "Learn DSA", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername() {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate date, Boolean done) {
		todos.add(new Todo(++todoCount, username, description, date, done));
	}

	public void deleteTodo(int id) {
		
		for (Todo todo : todos) {
			if(todo.getId() == id) {
				todos.remove(todo);
				return;
			}
		}
	}

	public Todo findById(int id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	public void updateTodo(@Valid Todo todo) {
		for(Todo temp : todos) {
			if (todo.getId() == temp.getId()) {
				temp.setDescription(todo.getDescription());
				temp.setTargetDate(todo.getTargetDate());
				temp.setDone(todo.getDone());
			}
		}
		
	}
}
