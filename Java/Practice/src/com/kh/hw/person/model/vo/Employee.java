package com.kh.hw.person.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		
		
	}
}
