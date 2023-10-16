package com.kh.example.practice3.model.vo;

public class Circle {
	//1. 멤버변수 생성 
	double PI = 3.14;
	int radius = 1;
	
	//2. 생성자 this를 활용
	public Circle () {
	// 기본 생성자, 아무런 초기화를 진행하지 않는다.
	}
	
	//3. 정보출력 메서드 만들기
	public void incrementRadius() {
		radius++;
		System.out.println(radius);
	}
	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void getAreaOfCircle() {
		double area = (radius * radius) * PI; 
		System.out.println("면적: " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름: " + radius);
		
	}
	
}
