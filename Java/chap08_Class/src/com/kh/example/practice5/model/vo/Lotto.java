package com.kh.example.practice5.model.vo;


public class Lotto {
		private void Lotto() {
		private int lotto[] = new int[6];
	 	// ��ȣ ����
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
            
       		  	 // �ߺ� ��ȣ ����
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	System.out.print("�ζ� ��ȣ: ");
	
  	 // ��ȣ ���
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}	
	     	 
		}

}
