package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getNameInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���: ");
		return sc.next();
	}
	public String getHobbyInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��̸� �Է��ϼ���: ");
		return sc.next();
	}

	public void displayResult(String name, String hobby) {
		System.out.println("�̸� : " + name);
		System.out.println("��� : " + hobby);
	}
}
