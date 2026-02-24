package com.demo.calculator;

import java.util.Arrays;

public class movingZeroes {
	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0};
		
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[idx]=arr[i];
				idx++;
			}
		}
		
		while(idx<arr.length) {
			arr[idx]=0;
			idx++;
		}
		System.out.println(arr);
	}
}
