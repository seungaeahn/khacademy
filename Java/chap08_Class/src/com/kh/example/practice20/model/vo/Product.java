package com.kh.example.practice20.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;


	public Product() {
		this.pName = "신라면";
		this.price = 3000;
		this.brand = "농심";
	}
	public void information() {
		System.out.println("상품명 : " + pName);
		System.out.println("가격 : " + price + "원");
		System.out.println("브랜드 : " + brand);
	}
	

	
}

