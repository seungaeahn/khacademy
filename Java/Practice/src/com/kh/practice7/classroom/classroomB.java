package com.kh.practice7.classroom;

public class classroomB {
	public static void main(String[] args) {
		String[] students = {
		        "강건강", "남나나", "도대담", "류라라", 
		        "문미미", "박보배", "송성실", "윤예의", 
		        "진재주", "차천축", "피풍표", "홍하하"
		    };

		    int rows = 3; // 행의 수
		    int cols = 2; // 열의 수
		    int totalStudents = students.length;

		    // 2차원 배열 초기화
		    String[][] firstDivision = new String[rows][cols];
		    String[][] secondDivision = new String[rows][cols];

		    int studentIndex = 0;

		    // 1분단 자리 배치
		    System.out.println("== 1분단 ==");
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

		    // 2분단 자리 배치
		    System.out.println("== 2분단 ==");
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
