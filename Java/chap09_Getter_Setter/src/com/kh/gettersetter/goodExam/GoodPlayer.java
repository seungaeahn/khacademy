package com.kh.gettersetter.goodExam;


public class GoodPlayer {
	 

	private String name; // ĳ���� �̸�
	
	public void setName(String name) { //�̸��� ����Ǹ� ����� set�� ���� ��. 
		this.name = name;
	}
	//�����ϴ� valid 
	public void ValidName() {
		if(this.name == "") { //ĳ���� �̸��� ������ ���� �� ���� 
			this.name = "No name";
			//System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}
	public String getName() { //ĳ���� �̸��� ��ȯ 
		return name;
	}
	

	
	private int health; // ü��
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void ValidHealth() {
		if(this.health == 0) {
			System.out.println("ü���� 0�Դϴ�.");
		}
	}
	public int getHealth() {
		return health;
	}
	
	
	private int attackPower; // �����Ŀ�
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAP() {
		if(this.attackPower == 0) {
			System.out.println("�����Ŀ��� 0�Դϴ�.");
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + this.name);
		System.out.println("ü�� ���� : " + this.health);
		System.out.println("���� �Ŀ� : " + this.attackPower);
	}
		
		
	}

