package com.kh.IAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {

	}
	
	public void InetPractice() {
		try {
			InetAddress address = InetAddress.getByName("seungaeahn.tistory.com");
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address�� bytes�� ����" );
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			System.out.println();
		
			InetAddress[] alladdress = InetAddress.getAllByName("www.tistory.com");
			System.out.println("tistory�� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
			
			
			
			
		
		
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		
		
	}

}
