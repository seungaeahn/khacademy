package com.kh.practice.array;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		/*
		 ����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
		������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
		��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
		ex.
		ġŲ �̸��� �Է��ϼ��� : ��� ġŲ �̸��� �Է��ϼ��� : �Ҵ�
		���ġŲ ��� ���� �Ҵ�ġŲ�� ���� �޴��Դϴ�.
		 */
	    Scanner sc = new Scanner(System.in);
	    String[] arr = {"���", "�Ķ��̵�", "����"};

	    System.out.print("ġŲ �̸��� �Է��ϼ���. : ");
	    String food = sc.nextLine();
	    int yesNo = 0;

	    for(int i = 0; i < arr.length; i++) {

	        if(arr[i].equals(food)) {
	            yesNo += 1;
	            break;
	        }
	    }
	    if(yesNo == 0) {
	        System.out.println(food + "��(��) ���� �޴��Դϴ�.");
	    }else {
	        System.out.println(food + "ġŲ ��� ����");
	    }

	}

}
