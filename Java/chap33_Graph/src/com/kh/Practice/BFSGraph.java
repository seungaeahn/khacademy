package com.kh.Practice;

import com.kh.BFS.Graph;

public class BFSGraph {

	public static void main(String[] args) {
		
		Graph g = new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		System.out.println("BFS Å½»ö °á°ú : ");
		g.BFS(0);
		System.out.println("========");
		g.BFS(1);
		System.out.println("========");
		g.BFS(2);
		System.out.println("========");
		g.BFS(3);
		System.out.println("========");
		g.BFS(4);
		System.out.println("========");
		g.BFS(5);
		
		
		
	}

}
