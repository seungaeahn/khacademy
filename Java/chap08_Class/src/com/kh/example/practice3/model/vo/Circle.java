package com.kh.example.practice3.model.vo;

public class Circle {
	//1. ������� ���� 
	double PI = 3.14;
	int radius = 1;
	
	//2. ������ this�� Ȱ��
	public Circle () {
	// �⺻ ������, �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
	}
	
	//3. ������� �޼��� �����
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
		System.out.println("����: " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������: " + radius);
		
	}
	
}
