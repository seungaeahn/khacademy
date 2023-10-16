package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name); 
	}
	
	@Override 
	public void eat() { 
		System.out.println(getName() + " 먹는데 다른 동물들이 무서워서 피한다.");
	}
}
