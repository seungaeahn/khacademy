package com.kh.abstractSample;
//�߻� Ŭ���� ��ӹ޴� ��ü���� Ŭ���� ����(���� Ŭ����)
public class Circle extends Shape {
	private double radius;
	
	//������
	public Circle(String color, double radius) {
		super(color); //�θ� Ŭ������ ������ ȣ�� 
		this.radius = radius;
	}
	//�߻� �޼��� ���� 
	
	@Override
	public double calculatorArea() {
		return Math.PI * radius * radius;
	}

	

}
