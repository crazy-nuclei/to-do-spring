package com.buildStuff.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

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
}
