package com.kh.Practice;

public class PracticeGraph {
	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
		ph.DFSPracticeMain();
	}
	public void BFSPracticeMain() {
		
	}
	
	public void DFSPracticeMain() {
		int ver = 7; //�׷��� ���� ���� 5�� ����
		DFSGraph graph = new DFSGraph(ver);
		
		//addEdge  ���� �߰��ϰڴ�.
		graph.addEdge(0, 1); //��� 0���� ��� 1�� ������ �ִ� ������ �߰�
		graph.addEdge(0, 2); //��� 0���� ��� 2�� ������ �ִ� ������ �߰�
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		
		System.out.println("DFS Ž�� ��� : ");

		// DFS Ž���� ������ ����� ��ȣ�� ����
		//0���� ������
		graph.DFS(0); // 0 1 3 2 4 5 6
	}

}