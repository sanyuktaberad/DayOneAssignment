package com.bridelabz.programsWithWhileLoop;

public class reverseTheIntegerNumber {
	
	public static void main (String[] args) {
		int n = 231;
		int remainder = 0, reverse = 0;
		while (n != 0) {
			remainder = n%10;
			reverse = reverse*10 + remainder;
			n = n/10;
		}
		System.out.println(reverse);
	}

}
