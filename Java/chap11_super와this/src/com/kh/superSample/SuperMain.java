package com.kh.superSample;
//상속받아서 super() super. 차이점 확인
/*
super = 부모 클래스의 변수나 메서드에 접근하기 위해 사용 
super() = 부모 클래스의 생성자를 호출하기 위해 사용
			서브 클래스의 생성자에서 첫번째 줄에 호출 되어야 함!
*/
public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		
		Child child2 = new Child("홍길동");
		child2.display();
		// super.display(); 했을 때 어떻게 되는지
		// super.display(); 얘를 사용하고 싶으면 어떻게 해야하는지 

	}

}
