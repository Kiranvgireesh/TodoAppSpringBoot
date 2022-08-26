package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private TodoService todoservice;
	
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}


	@RequestMapping("list-todos")
	public String listAllTodos(Model model) {
		List<Todo> todos=todoservice.findByUsername("kiran");
		model.addAttribute("todos",todos);
		return "listTodos";
		
	}

}
