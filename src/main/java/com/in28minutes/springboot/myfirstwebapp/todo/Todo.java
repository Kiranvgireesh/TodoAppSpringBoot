package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	@Size(min=10 ,message="Enter atleast 10 charactors")
	private String description;
	private LocalDate targetDate;
	private String username;
	private boolean done;
	
	public Todo() {
	}	
	public Todo(int id, String username, LocalDate targetDate, String description, boolean done) {
		super();
		this.id = id;
		this.description = description;
		this.targetDate = targetDate;
		this.username = username;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", targetDate=" + targetDate + ", username="
				+ username + ", done=" + done + "]";
	}

}
