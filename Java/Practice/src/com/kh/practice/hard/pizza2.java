package com.kh.practice.hard;

public class pizza2 {

	public static void main(String[] args) {
		    int n = 10;
		        int pizza = 0;
		        int number = 1;
		       if (n%6 == 0) {
		           pizza = n/6;
		       } else {
		           for(int i=2; i < 6*n; i++) {
		                if(6%i ==0 && n%i==0) {
		                    number *= i;
		                   
		                }
		               //if()
		                pizza = number * (n%number) ;
		           }
		       
		       }
		        
		        
		    
		
	}

}
