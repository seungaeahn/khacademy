package com.kh.example.practice4.model.vo;

public class Student {
	//1. 멤버변수 생성 
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2. 생성자 this를 활용
	public Student() {
		this.grade = 1;
		this.classroom = 2;
		this.name = "박성철";
		this.height = 180.5; 
		this.gender = '남';
	}
	//3. 정보출력 메서드 만들기
	public void information() {
		System.out.println("학년: " + grade);
		System.out.println("반: " + classroom);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("성별: " + gender);
	}
	
}
