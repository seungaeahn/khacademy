package com.kh.classSample;

public class Car {
	// 1. ���� �ʵ� �������
	String brand;     //�귣��
	String model;     //��
	int speed;        //�ӵ�
	boolean engineOn; //��������
	
	// 2. �����ڴ� �޼����� �Ѱ��� ���� 
	public Car() { //���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	/* ==================================================================================
	 * ��� ���� �ؿ��� ��� �޼���� ����	
	 */
	}
	
	// ���� ���� �޼���
	public void startEngine() {
		//���࿡ ������ true�� ���� �õ�
		if(engineOn) {
			System.out.println("������ �õ��մϴ�."); //��� �޼��� �ۼ�
		} else { //���࿡ ������ false�� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
	}
		// ���� �޼���
	public void acclerate(int amount) {
			if(engineOn) {
				// ������ true�� ���� �ӵ��� �󸶴�.
				System.out.println("�ӵ� ���Դϴ�.");
			} else {// ������ false�� ������ ���� �־� �ӵ��� �� �� ����.
				System.out.println("�ӵ��� �� �� ����");
			
			}
			
	}
		
}
	


















