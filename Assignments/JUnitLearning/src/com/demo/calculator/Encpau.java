package com.demo.calculator;

public class Encpau {

//	private int n;
//	
//	public int getN() {
//		return n;
//	}
//	
//	public int setN() {
//		n = n1;
//	}
	
	public static void main(String[] arg) {
		
	
	int arr[] = {10,5,2,23};
	int large = Integer.MIN_VALUE;
	int secondl = Integer.MIN_VALUE;
	
	for(int i = 0;i<arr.length;++i) {
		if(arr[i] > large) {
			secondl = large;
			large = arr[i];
			
			
		}else if(arr[i] > secondl && arr[i]!= large) {
			secondl = arr[i];
		}
	}
	System.out.println(secondl);
	}
}
