package com.kh.abstractSample;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	//������
		public Rectangle(String color, double width, double length) {
			super(color); //�θ� Ŭ������ ������ ȣ�� 
			this.width = width;
			this.length = length;
		}
		//�߻� �޼��� ���� 
		
		@Override
		public double calculatorArea() {
			return width * length;
		}	
}
