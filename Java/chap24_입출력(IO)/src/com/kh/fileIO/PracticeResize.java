package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// �̹��� �ϳ� �ҷ�����
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "onion.jpg";
		String outputImg = path + "onionNew.jpg";
		// ����ȭ�鿡 ���ο� ���� ����� mkdir
		String folderPath ="C://Users//user1//Desktop//Vegi";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		//���� ���������� �̹��� ����ȭ�鿡 ���� ���� ������ �����ϱ� 
		int width = 300; //���� ����
		int height = 300; //���� ����
		try {
			//���� �̹����� �ҷ�����
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			//���ο� ũ��� �̹��� ��������
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			//BufferedImage ��ȯ 
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			//��������� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("�̹��� �������� �Ϸ�!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� �������� �� �����߻�! : " + e.getMessage());
			
		}
		
		String inputFile = "C:\\Users\\user1\\Desktop\\onionNew.jpg";
		String outputFile = "C:\\Users\\user1\\Desktop\\Vegi\\onionNew.png";

		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
				byte[] buffer = new byte[1024];
				int byteRead;
				
				while((byteRead = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, byteRead);
				}
				System.out.println("������ ����Ǿ����ϴ�!");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	

}
