package com.kh.finalSample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		int port = 1564;
		
		ServerSocket server;
		
		server = new ServerSocket(port);
		
		while(true) {
			Socket client = server.accept();
			System.out.println(client.getInetAddress());
			
			InputStream inStream = client.getInputStream(); 
			
			Scanner sc = new Scanner(inStream);
			System.out.println("Server | Client : " + sc.nextLine());
			OutputStream outStream = client.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			System.out.println("클라이언트와 연결되었습니다!");
			client.close();
		}
	
	}
	
}

