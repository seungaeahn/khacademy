package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		//
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speack();
		myDog.eat();
		
		Cat myCat = new Cat("��߹�");
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("����");
		myMonkey.eat();
		
		Lion myLion = new Lion("���̿�");
		myLion.eat();
	}

}
