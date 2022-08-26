package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList(); 
	
	private static int todosCount=0;
	
	
	static {
		todos.add(new Todo(++todosCount, "TODOAPP",LocalDate.now().plusYears(1), 
							"Learn AWS", false ));
		todos.add(new Todo(++todosCount, "TODOAPP",LocalDate.now().plusYears(2), 
				"Learn DevOps", false ));
		todos.add(new Todo(+todosCount, "TODOAPP",LocalDate.now().plusYears(3), 
				"Learn Full Stack Development", false ));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
	
		Todo todo = new Todo(++todosCount,username,targetDate,description,done);
		todos.add(todo);
	}

}
