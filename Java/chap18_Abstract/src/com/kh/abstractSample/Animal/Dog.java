package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	private String name;
	private String sound;
	//������ super
	public Dog(String name) {
		super(name); //�θ� Ŭ������ ������ ȣ�� 
		this.name = name;
	
	}
	@Override
	public String makeSound() {
		System.out.println("�۸�");
		return name;
	}
}
