package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		//
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speack();
		myDog.eat();
		
		Cat myCat = new Cat("绊具固");
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("件捞");
		myMonkey.eat();
		
		Lion myLion = new Lion("扼捞柯");
		myLion.eat();
	}

}
