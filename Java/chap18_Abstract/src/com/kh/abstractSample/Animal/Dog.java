package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	private String name;
	private String sound;
	//积己磊 super
	public Dog(String name) {
		super(name); //何葛 努贰胶客 积己磊 龋免 
		this.name = name;
	
	}
	@Override
	public String makeSound() {
		System.out.println("港港");
		return name;
	}
}
