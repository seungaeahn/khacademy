package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {

		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
	}	
	
	public void Practice1() {
		//���� �������� 2�� �����  C://Users//user1//Desktop//�̸�1//�̸�2
		String folderPath ="C://Users//user1//Desktop//�̸�1";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop//�̸�1//�̸�2");
			w.write("User�� �̸��� ��� ���Դϴ�.");
			w.write("ȫ�浿");
			w.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void Practice2() {
		//���� �������� 3�� �����  C://Users//user1//Java_Workspace//chap25_
		String folderPath ="C://Users//user1//Java_Workspace//chap25_//java//new,p";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
//		try {
//			FileWriter w = new FileWriter("C://Users//user1//Java_Workspace//chap25_//java");
//			w.write("é��25�� �ʱ⸦ ��� ���Դϴ�.");
//			w.write("���� �ۼ���");
//			w.close();
//			
//		} catch(IOException e) {
//			e.printStackTrace();
		}
	}
	public void Practice3() {
		//���� �������� 5�� ����� C://Users//user1//Desktop//myPlace//Music//Korean//kPop//Group
		String folderPath =" C:\\Users\\user1\\Desktop\\myPlace\\Music\\Korean\\kPop";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\myPlace\\Music\\Korean\\kPop\\Group.txt");
			w.write("�ѱ��� ������ �׷�");
			w.write("����ũ BTS");
			w.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
			
}
