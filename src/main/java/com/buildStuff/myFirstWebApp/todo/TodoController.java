package com.buildStuff.myFirstWebApp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
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
	public String getAddNewTodoPage(ModelMap model) {
		Todo todo = new Todo(0, (String)model.get("name"), "AA", LocalDate.now(), false);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(path = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		
		if (result.hasErrors()) {
			return "todo";
		}
		
		todoService.addTodo(todo.getUsername(), todo.getDescription(), todo.getTargetDate().plusYears(1), todo.getDone());
		return "redirect:list-todos";
	}
}
