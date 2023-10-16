package com.kh.abstractSample;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	//생성자
		public Rectangle(String color, double width, double length) {
			super(color); //부모 클래스와 생성자 호출 
			this.width = width;
			this.length = length;
		}
		//추상 메서드 구현 
		
		@Override
		public double calculatorArea() {
			return width * length;
		}	
}
