package com.kh.abstractSample.Animal;

public class Cat extends Animal{
	private String name;
	private String sound;
	//������ super
	public Cat(String name) {
		super(name); //�θ� Ŭ������ ������ ȣ�� 
		this.name = name;
	
	}
	
	@Override 
	public String makeSound() {
		System.out.println("�߿�");
		return name;
	}
}
