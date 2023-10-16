package com.kh.inheritance.animal;

public class Monkey extends Animal {
	public Monkey(String name) {
		super(name); 
	}
	
	@Override 
	public void eat() { 
		System.out.println(getName() + " 바나나를 나무에서 따와 먹습니다.");
	}
	

}
