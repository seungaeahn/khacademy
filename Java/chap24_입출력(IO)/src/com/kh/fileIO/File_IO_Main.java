package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt");
			writer.write("���� ���� �������� �׽�Ʈ"); //���� ����
			writer.close(); //���� �ȿ� ������ �پ��� �ݱ�
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
			}
			
			bufferedReader.close(); //������ �� ������ �ݾ��ֱ�.
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
