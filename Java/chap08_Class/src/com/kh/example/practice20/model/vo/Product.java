package com.kh.example.practice20.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;


	public Product() {
		this.pName = "�Ŷ��";
		this.price = 3000;
		this.brand = "���";
	}
	public void information() {
		System.out.println("��ǰ�� : " + pName);
		System.out.println("���� : " + price + "��");
		System.out.println("�귣�� : " + brand);
	}
	

	
}

