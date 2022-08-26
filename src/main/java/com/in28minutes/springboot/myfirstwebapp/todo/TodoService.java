package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList(); 
	
	
	static {
		todos.add(new Todo(1, "TODOAPP",LocalDate.now().plusYears(1), 
							"Learn AWS", false ));
		todos.add(new Todo(2, "TODOAPP",LocalDate.now().plusYears(2), 
				"Learn DevOps", false ));
		todos.add(new Todo(3, "TODOAPP",LocalDate.now().plusYears(3), 
				"Learn Full Stack Development", false ));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}

}
