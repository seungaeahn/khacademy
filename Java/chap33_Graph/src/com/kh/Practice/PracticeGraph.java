package com.kh.Practice;

public class PracticeGraph {
	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
		ph.DFSPracticeMain();
	}
	public void BFSPracticeMain() {
		
	}
	
	public void DFSPracticeMain() {
		int ver = 7; //그래프 노의 수를 5로 정의
		DFSGraph graph = new DFSGraph(ver);
		
		//addEdge  간선 추가하겠다.
		graph.addEdge(0, 1); //노드 0에서 노드 1로 방향이 있는 엣지를 추가
		graph.addEdge(0, 2); //노드 0에서 노드 2로 방향이 있는 엣지를 추가
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		
		System.out.println("DFS 탐색 결과 : ");

		// DFS 탐색을 시작할 노드의 번호를 전달
		//0으로 시작함
		graph.DFS(0); // 0 1 3 2 4 5 6
	}

}