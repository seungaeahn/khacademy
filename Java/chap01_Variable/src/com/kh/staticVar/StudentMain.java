package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh�л�1");
		//System.out.println(stKim.serialNum);
		// �б����� �л� ȸ������
		// �ϴ� �츮�б� �л��� �´��� Ȯ��
		// �츮�б� �л� ����Ű;
		// �ø��� �ѹ��� �����ؼ� -> 20
		// kh�л�1 20
		// kh�л�2 20
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2�л�");
		System.out.println("KH stKim : ");
		System.out.println(stKim.serialNum);
		System.out.println("KH 2�л� : ");
		System.out.println(khLee.serialNum);
		
	}

}
