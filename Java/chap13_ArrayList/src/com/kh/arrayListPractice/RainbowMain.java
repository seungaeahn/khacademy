package com.kh.arrayListPractice;
import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		/*
		 3-1)ArrayList �̿��ؼ� �� �� �� �� �� �� ��
		���� 3ȸ 1,3,5 ->��, ����, �׸� ���� 
		���ϱ� 2ȸ ->��, [���ο�],�׸�,[�����Ķ�] 
		���, ���� ���� 
		���� for�� �̿��ؼ� ���� ����ϱ�
		������� �� �� ��

		 */
				ArrayList<String> colors = new ArrayList<>();
				System.out.println("colors: " + colors); 
				
				//����߰�
				colors.add("��");
				colors.add("��");
				colors.add("��");
				colors.add("��");
				colors.add("��");
				colors.add("��");
				colors.add("��");
				System.out.println("�������: " + colors);
				
				//��� �����ϱ�
				colors.set(1, "��");
				colors.set(3, "����");
				colors.set(4, "�׸�");
				
				System.out.println("����üũ1: " + colors);
				
				//��� ���ϱ� 
				System.out.println();
				colors.add(2,"���ο�");
				colors.add(6,"�����Ķ�");
				System.out.println("����üũ2: " + colors);
				
				//��� ����
				colors.remove(3);
				colors.remove(3);
				System.out.println("����üũ3: " + colors);
			
				
				//ArrayList ��ȸ�ؼ� ��� ��� 
				System.out.println("��� ���� ���");
				//for(����ǵ�����Ÿ�� ������ : ArrayList������) {
				for (String color :colors) {
					System.out.println(color);
				}
				
				//1. �ε����� �̿��ؼ� �ڸ� ���
				colors.set(6, "��");
				System.out.println("�������: " + colors.get(0) + " " + colors.get(5) + " " + colors.get(6));
				
				
				
				
	}

}