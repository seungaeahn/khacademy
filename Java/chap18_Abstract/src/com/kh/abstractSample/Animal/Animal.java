package com.kh.abstractSample.Animal;

abstract class Animal {
	//�ʵ� �ۼ� 
	private String name;
	
	//�޼ҵ�(������) �ۼ� ���
	public Animal(String name) {
		this.name = name;
	}
	
	//�߻� �޼���� ���� �Ҹ� ���
	abstract  String makeSound();
	
	//�Ϲ� �޼��� ���� �̸� ��� 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
