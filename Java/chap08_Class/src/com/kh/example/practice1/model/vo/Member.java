package com.kh.example.practice1.model.vo;

public class Member {
/*
 * 1. 멤버변수 
 - memberId : String
- memberPwd : String
- memberName : String
- age : int
- gender : char
- phone : String
- email : String
* 2. 생성자
+ Member()
* 3. 출력 메소드
+ changeName(name:String):void
+ printName():void
 */
	/*1. 멤버변수*/
	String memberId;
	String memberPwd;
	String mamberName;
	int age;
	String phone; //int String 차이점
	String email;
	
	/*2. 생성자 + Member() */
	public Member(String memberId, String memberPwd, String mamberName, int age, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.mamberName = mamberName;
		this.age = age;
		this.phone = phone;
		this.email = email;
				
	}
	
	public void chageName(String name) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println();
	}
	
}














