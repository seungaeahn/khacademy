package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name); 
	}
	
	public void run() {
		System.out.println(getName() + " �����̿ͼ� �޸���!");
	}
	
	@Override 
	public void eat() { //animal�� �����ִ� eat�� ����� �ο����� �ٽ� ���Ǹ� ���ش�.
		System.out.println(getName() + " �Դµ� �߰��� �������� ���� ��");
	}
	
}