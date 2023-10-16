package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph Ŭ����
 	�ڷ� ������ ��Ÿ�� 
 	
 */
public class Graph {
	private int V; //�׷����� ���� ��
	private LinkedList<Integer>[] adj; //���� ����Ʈ
	
	//�׷��� �ʱ�ȭ
	//Graph Ŭ������ �����ڿ��� �׷��� ���� ��(V)�� �޾Ƽ� �ʱ�ȭ
	//adj ���� ����Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� ����
	public Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	//�׷����� ���� �߰�
	//addEdge �׷����� ������ �߰�
	//v�� w�� ������ �� �� ������ ��Ÿ�� 
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	//BFS Ž���� ��
	public void BFS(int start) {
		//visited �迭�� �� ������ �湮 ���θ� ����
		boolean[] visited = new boolean[V]; //�湮���θ� ǥ���ϱ� ���� �迭
		Queue<Integer> queue = new LinkedList<>();
		//BFS�� ���� ������ ������ ���
		//Ž���� ���� ���(start)���� �����ϰ� ���� ��带 �湮�ϰ� ť�� �߰� 
		visited[start] = true;
		queue.add(start);
		//ť�� �̾��� ������ �ݺ������� ���� �ܰ迡 ������ ��带 �湮 
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.println(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
	
			}
		}
	}
	
}
