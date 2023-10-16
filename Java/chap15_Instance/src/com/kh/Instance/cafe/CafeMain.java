package com.kh.Instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("아메리카노", 1, false);
		Cafe client2 = new Cafe("카페라떼", 3, true);
		Cafe client3 = new Cafe("아이스티", 2, true);
		
		client1.makeCafe();
		client2.makeCafe();
		client3.makeCafe();
		

	}

}
