package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
	Date: ��¥�� �ð� ������ ��Ÿ���µ� ���
	java1.1 ���� ������� ����
		java.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("���� ��¥/�ð� : " + currentDateTime);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		
		// minus plus �̿��ؼ� �� 2���� ������ ��4��
		LocalTime todayTime = LocalTime.now();
		LocalTime futureTime = todayTime.plusHours(12);
		System.out.println("12�ð� �� �ð� : " + futureTime);
		LocalTime pastMinutes = todayTime.minusMinutes(30);
		System.out.println("30���� �ð� : " + pastMinutes);
		LocalTime futureSeconds = todayTime.plusSeconds(100);
		System.out.println("100�� �� �ð� : " + futureSeconds);
		LocalTime pastMin = todayTime.minusMinutes(90);
		System.out.println("90���� �ð� : " + pastMin);
		
		LocalDate date1 = LocalDate.of(2023, 8, 26);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		
		
		if(date1.isBefore(date2)) {
			System.out.println(date1 + "�� " + date2 + "�����Դϴ�.");
		} else if (date1.isAfter(date2)) {
			System.out.println(date1 + "�� " + date2 + "�����Դϴ�.");
		} else {
			System.out.println(date1 + "�� " + date2 + "�� ���� ��¥�Դϴ�8.");
		}
		
		
		
		
	}

}










