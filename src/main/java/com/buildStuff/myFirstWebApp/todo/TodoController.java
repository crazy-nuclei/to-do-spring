package com.buildStuff.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(path = "add-todo", method = RequestMethod.GET)
	public String getAddNewTodoPage() {
		return "todo";
	}
	
	@RequestMapping(path = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(@RequestParam String description) {
		todoService.addTodo("AA", description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}
