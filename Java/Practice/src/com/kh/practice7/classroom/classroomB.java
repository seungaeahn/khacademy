package com.kh.practice7.classroom;

public class classroomB {
	public static void main(String[] args) {
		String[] students = {
		        "���ǰ�", "������", "�����", "�����", 
		        "���̹�", "�ں���", "�ۼ���", "������", 
		        "������", "��õ��", "��ǳǥ", "ȫ����"
		    };

		    int rows = 3; // ���� ��
		    int cols = 2; // ���� ��
		    int totalStudents = students.length;

		    // 2���� �迭 �ʱ�ȭ
		    String[][] firstDivision = new String[rows][cols];
		    String[][] secondDivision = new String[rows][cols];

		    int studentIndex = 0;

		    // 1�д� �ڸ� ��ġ
		    System.out.println("== 1�д� ==");
		    for(int row = 0; row < rows; row++) {
		        for (int col = 0; col < cols; col++) {
		            if (studentIndex < totalStudents) {
		                firstDivision[row][col] = students[studentIndex];
		                System.out.print(students[studentIndex] + " ");
		                studentIndex++;
		            }
		        }
		        System.out.println();
		    }

		    System.out.println();

		    // 2�д� �ڸ� ��ġ
		    System.out.println("== 2�д� ==");
		    for (int row = 0; row < rows; row++) {
		        for (int col = 0; col < cols; col++) {
		            if (studentIndex < totalStudents) {
		                secondDivision[row][col] = students[studentIndex];
		                System.out.print(students[studentIndex] + " ");
		                studentIndex++;
		            }
		        }
		        System.out.println();
		    }
	}
	
}
