package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("������");
		System.out.println(dog.makeSound());
		//1. cat �����
		Cat cat = new Cat("�����");
		//2. ��ü�迭�� Animal���� ����ϱ� 
		//�������� Ȱ���� ��ü �ٷ�� 
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("������");
		animal[1] = new Cat("�����");
		System.out.println(dog.makeSound());
		System.out.println(cat.makeSound());
		
		
	}

}
