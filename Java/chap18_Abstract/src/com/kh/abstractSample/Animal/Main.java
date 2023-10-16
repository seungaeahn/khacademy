package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("강아지");
		System.out.println(dog.makeSound());
		//1. cat 만들기
		Cat cat = new Cat("고양이");
		//2. 객체배열로 Animal만들어서 출력하기 
		//다형성을 활용한 객체 다루기 
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("강아지");
		animal[1] = new Cat("고양이");
		System.out.println(dog.makeSound());
		System.out.println(cat.makeSound());
		
		
	}

}
