package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();

	}
	public void practice1() { //��� �����ؼ� ���� �����
		try {
			//��� ������ ��ΰ� Ȯ���� ��� ������ 
			FileWriter w = new FileWriter("C://Users//user1//Java_Workspace//chap24_�����(IO)//src//com//kh//practice//FileName.txt");
			//���� ����
			w.write("�� �ۼ��Ǿ����� Ȯ��");
			//���� �ݱ�
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void practice2() {
		//������ ����� ���� �ȿ� ������ ����� 
		//���� �ȿ� ���� �ۼ��ϱ� 
		String folderPath ="C://Users//user1//Desktop//seungae";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("���� ���� ����!");
		
		} else {
			System.out.println("������ �̹� ����!");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop//seungae//seungaeInfo.txt");
			w.write("seungae�� ������ ��� ���Դϴ�.");
			w.write("Kh�л�, 2000.04.17, ��, ������ ����");
			w.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
