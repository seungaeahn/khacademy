package com.kh.Instance.cafe;

public class Cafe {
	private String type; //��������
	private int size; //���� ������
	boolean isSugar; //��������
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void makeCafe() {
		System.out.println(type + "�� ����ϴ�.");
		System.out.println("ũ��: " + size);
		//���࿡ ������ �ִ´ٸ� 
		if (isSugar) { // true
			System.out.println("���� �߰�");
		}
			
	}
}
