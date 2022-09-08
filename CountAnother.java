package com.ds;

public class CountAnother {
	public int countDigits(int n) {
		System.out.println("Enter the nunber:");
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}

}
