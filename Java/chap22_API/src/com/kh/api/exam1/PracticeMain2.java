package com.kh.api.exam1;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm2 = new PracticeMain2();
		pm2.practice1();
		pm2.practice2();
		pm2.practice3();
		pm2.practice4();
		pm2.practice5();

	}
	public void practice1() {
		//���ڿ� �����̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("���� "); 
		sb.append("������ ������");
		System.out.println(sb.toString());
	}
	public void practice2() {
		//���ڿ� ������ reverse
		StringBuffer sb = new StringBuffer();
		String str = "���� ������ ������";
		sb.append(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	public void practice3() {
		//���ڿ� ���� insert ?����
		StringBuffer sb = new StringBuffer();
		String str = "���� ������ ������";
		sb.append(str);
		sb.insert(10, "?����");
		System.out.println(sb.toString());
	}
	public void practice4() {
		//���ڿ� ��ü replace(,,);
		StringBuffer sb = new StringBuffer();
	    String str = "���� ������ ������";
	    sb.append(str);
	    sb.replace(3, 5, "����");
	    System.out.println(sb.toString());
	}
	public void practice5() {
		//���ڿ� ���� delete(,,);
		StringBuffer sb = new StringBuffer();
	    String str = "���� ������ ������";
	    sb.append(str);
	    sb.delete(2, 5);
	    System.out.println(sb.toString());
	}
	
	
}









