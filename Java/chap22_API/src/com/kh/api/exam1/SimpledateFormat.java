package com.kh.api.exam1;

import java.util.Date;
import java.text.SimpledateFormat;

public class SimpledateFormat {
	/*
	 * SimpleDateFormat
	 	��¥�� �ð��� ���ϴ� �������� �������ϰų�
	 	���ڿ��� ���� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ���� 
	 */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpledateFormat sdf = new SimpledateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		String forDate = sdf.format(currentDate);
	}
	
}
