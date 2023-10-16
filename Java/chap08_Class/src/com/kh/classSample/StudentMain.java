package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		Student student1 = new Student("kh학생", 20, "1학년");
		// 학생 정보 출력
		student1.displayInfo();
		/*
		 * 학생을 3명 만들어서 3명 출력하기
		 * student2, student3, student4
		 */
		Student student2 = new Student("ab학생", 25, "3학년");
		Student student3 = new Student("cd학생", 24, "4학년");
		Student student4 = new Student("ef학생", 28, "6학년");
		
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	}

}
