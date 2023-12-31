package com.kh.thisSample;

	/*
	 * 
		int x = 10; //정수 x를 10값 할당 
		int y = x; //참조변수 y x를 가리킨다.
		
		x = 20;
		
		System.out.println("y : " + y);
		
		int[] list1 = {1,2,3};
		int[] list2 = list1; //list2 list1 
		
	 this 인스턴스 자신을 가리키는 참조변수 인스턴스의 주소가 저장 
	 this 객체(=인스턴스) 자신을 가리키는 참조 변수 객체(=인스턴스)의 주소가 저장. 
	 this() 현재 클래스의 다른 생성자를 호출하는데 사용 
	 */
	class MyClass {
		int myField;
		
		//첫 번째 생성자
		MyClass() {
			//this.myFeild = 0; //this() 사용해서 다른 생성자 호출 
			this(0); //this를 사용해서 다른 생성자 호출 
		}
		//두 번째 생성자
		MyClass(int value) {
			this.myField = value;
		}
		void printValue() {
			System.out.println("myFeild의 값: " + this.myField);
		}
	}

public class ThisMain {
	public static void main(String[] args) {
		 MyClass obj1 = new MyClass(); //첫 번째 생성자 호출
		 MyClass obj2 = new MyClass(); //두 번째 생성자 호출
		 
		 obj1.printValue();
		 obj2.printValue();

	}

}











