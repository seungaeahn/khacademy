package com.kh.ThreadPractice;

import java.util.Random;

class GameLoop implements Runnable{
	private static boolean isGameOver = false;
	
	@Override
	public void run() {
		while(!isGameOver) {
			//���� ���� ����
			int randomValue = new Random().nextInt(10);//������ ���� ����
			System.out.println("������ ���� : " + randomValue);
			
			//���� ���� ���� �ð�
			try {
				Thread.sleep(1000); //1�� ���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("���� ����");	
		}
	}
}