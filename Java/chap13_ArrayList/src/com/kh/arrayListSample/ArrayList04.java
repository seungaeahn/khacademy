package com.kh.arrayListSample;

public class ArrayList04 {

	public static void main(String[] args) {
		// ���ڿ� �迭�� ����ؼ�
		//���� for Loop�� ���ڿ� �迭�� ��� ��
		//���� �� ���ڿ��� ã�� ����ϱ� 
		String[] ss = {"apple", "banana", "cherry", "elderBerry"};
		String longss = "";
		// ���� �� ���ڿ� ã�Ƽ� �������
		for(String str : ss) {
			//str.length
			if (str.length()>longss.length()) {
				longss = str; 
			}
		}
		System.out.println("���� �� ���ڿ��� : " + longss);
	}

}
