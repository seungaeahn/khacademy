package com.kh.Instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("�Ƹ޸�ī��", 1, false);
		Cafe client2 = new Cafe("ī���", 3, true);
		Cafe client3 = new Cafe("���̽�Ƽ", 2, true);
		
		client1.makeCafe();
		client2.makeCafe();
		client3.makeCafe();
		

	}

}
