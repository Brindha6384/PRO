package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="mytable")
public class Model {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int Id;
	@Column(name="TaskToDo")
	private String Tasktodo;
	@Column(name="TaskInProgress")
	private String Taskinprogress;
	@Column(name="TaskCancelled")
	private String Taskcancelled;
	@Column(name="TaskCompleted")
	private String Taskcompleted;
	@Column(name="TaskHold")
	private String Taskhold;
	
	public Model(String tasktodo, String taskinprogress, String taskcancelled, String taskcompleted, String taskhold) {
		super();
		Tasktodo = tasktodo;
		Taskinprogress = taskinprogress;
		Taskcancelled = taskcancelled;
		Taskcompleted = taskcompleted;
		Taskhold = taskhold;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTasktodo() {
		return Tasktodo;
	}
	public void setTasktodo(String tasktodo) {
		Tasktodo = tasktodo;
	}
	public String getTaskinprogress() {
		return Taskinprogress;
	}
	public void setTaskinprogress(String taskinprogress) {
		Taskinprogress = taskinprogress;
	}
	public String getTaskcancelled() {
		return Taskcancelled;
	}
	public void setTaskcancelled(String taskcancelled) {
		Taskcancelled = taskcancelled;
	}
	public String getTaskcompleted() {
		return Taskcompleted;
	}
	public void setTaskcompleted(String taskcompleted) {
		Taskcompleted = taskcompleted;
	}
	public String getTaskhold() {
		return Taskhold;
	}
	public void setTaskhold(String taskhold) {
		Taskhold = taskhold;
	}
	
	
	

}
