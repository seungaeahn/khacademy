package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("���̸�������");
		player1.ValidName();
		
		player1.setHealth(-10); // -10 ü���� �������ְ� 
		player1.ValidHealth(); // -10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)���� �����Ѵ�.
		
		player1.setAttackPower(-20);
		player1.ValidAP();
		
		//player1.displayInfo();
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName("���ݹ�����");
		player2.ValidName();
		player2.setHealth(80);
		player2.ValidHealth();
		player2.setAttackPower(10);
		player2.ValidAP();
		
		//player2.displayInfo();
		
		System.out.println("attack !!!!! ��");
		
		//player1.attack(player2);
		//player2.attack(player1);
	}

}
