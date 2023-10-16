package com.kh.gettersetter.goodExam;


public class GoodPlayer {
	 

	private String name; // 캐릭터 이름
	
	public void setName(String name) { //이름이 변경되면 저장될 set을 만든 것. 
		this.name = name;
	}
	//검증하는 valid 
	public void ValidName() {
		if(this.name == "") { //캐릭터 이름에 공백이 없는 지 검증 
			this.name = "No name";
			//System.out.println("이름을 넣지 않았습니다.");
		}
	}
	public String getName() { //캐릭터 이름을 반환 
		return name;
	}
	

	
	private int health; // 체력
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void ValidHealth() {
		if(this.health == 0) {
			System.out.println("체력이 0입니다.");
		}
	}
	public int getHealth() {
		return health;
	}
	
	
	private int attackPower; // 공격파워
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAP() {
		if(this.attackPower == 0) {
			System.out.println("공격파워가 0입니다.");
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	public void displayInfo() {
		System.out.println("캐릭터 정보 : " + this.name);
		System.out.println("체력 정보 : " + this.health);
		System.out.println("공격 파워 : " + this.attackPower);
	}
		
		
	}

