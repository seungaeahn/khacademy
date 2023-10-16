package com.kh.finalSample;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	public static void main(String[] args) {
		int port = 1564;
		String serverIP;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			
			InputStream InStream = socket.getInputStream();
			
			System.out.println(serverIP);
			socket.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

		
	}
	
}
