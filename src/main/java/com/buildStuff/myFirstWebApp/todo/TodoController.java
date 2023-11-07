package com.buildStuff.myFirstWebApp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String getTodosPage(ModelMap model) {
		List<Todo> todos = todoService.findByUsername();
		model.addAttribute("todos", todos);
		return "listTodos";
	}
}
