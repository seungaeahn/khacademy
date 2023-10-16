package com.kh.abstractSample;
//�߻� Ŭ���� ���� 
abstract class Shape {
	//�Ϲ� �ʵ�
	private String color;
	
	//�߻� �޼��� (���� Ŭ�������� �����ؾ� ��)
	abstract double calculatorArea();
	
	
	//������ ���ϰ� ���̵尡 ����
	public Shape(String color) {
		this.color = color;
	}
	
	//�Ϲ� �޼���
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	

}
