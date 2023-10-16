package com.kh.abstractSample;
//추상 클래스 정의 
abstract class Shape {
	//일반 필드
	private String color;
	
	//추상 메서드 (하위 클래스에서 구현해야 함)
	abstract double calculatorArea();
	
	
	//생성자 리턴과 보이드가 없음
	public Shape(String color) {
		this.color = color;
	}
	
	//일반 메서드
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	

}
