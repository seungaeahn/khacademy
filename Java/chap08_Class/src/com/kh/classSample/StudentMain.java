package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		Student student1 = new Student("kh�л�", 20, "1�г�");
		// �л� ���� ���
		student1.displayInfo();
		/*
		 * �л��� 3�� ���� 3�� ����ϱ�
		 * student2, student3, student4
		 */
		Student student2 = new Student("ab�л�", 25, "3�г�");
		Student student3 = new Student("cd�л�", 24, "4�г�");
		Student student4 = new Student("ef�л�", 28, "6�г�");
		
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	}

}
