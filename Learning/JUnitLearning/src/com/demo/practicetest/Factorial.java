package com.demo.practicetest;

public class Factorial {
	public static long factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Input must be a non-negative integer");
		}
		if(n==0 || n==1) {
			return 1;
		}
		int res=1;
		for(int i=2;i<=n;i++) {
			res*=i;
		}
		return res;
	}
}
