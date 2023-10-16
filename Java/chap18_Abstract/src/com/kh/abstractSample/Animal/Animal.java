package com.kh.abstractSample.Animal;

abstract class Animal {
	//필드 작성 
	private String name;
	
	//메소드(생성자) 작성 명사
	public Animal(String name) {
		this.name = name;
	}
	
	//추상 메서드로 동물 소리 출력
	abstract  String makeSound();
	
	//일반 메서드 동물 이름 출력 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
