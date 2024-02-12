package com.example.SpendBox.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="expense_box")
public class Expense {

	@Id
	@Embedded
	private long id;
	@Column(name = "person_name")
	private String name;
	@Column
	private double salary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Expense [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Expense() {
		super();
	}
	 
}
