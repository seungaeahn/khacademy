package com.kh.Instance.cafe;

public class Cafe {
	private String type; //음료종류
	private int size; //음료 사이즈
	boolean isSugar; //설탕여부
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void makeCafe() {
		System.out.println(type + "를 만듭니다.");
		System.out.println("크기: " + size);
		//만약에 설탕을 넣는다면 
		if (isSugar) { // true
			System.out.println("설탕 추가");
		}
			
	}
}
