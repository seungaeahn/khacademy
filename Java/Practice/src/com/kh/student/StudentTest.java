package com.kh.student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student Ŭ���� ���� 
		studentAhn.studentName = "�Ƚ¾�";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}