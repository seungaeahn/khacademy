package com.kh.fileIO;

import java.io.File;

public class File_Delete_Main {

	public static void main(String[] args) {
		String mainPath= "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "Cute.jpg";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���� ����
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����ϴµ� �����߽��ϴ�.");
		}
	}

}
