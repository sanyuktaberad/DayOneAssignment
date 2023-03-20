package com.bridelabz.programsWithWhileLoop;

public class sumOfNaturalNumbers {

	public static void main(String[] args) {
		int num = 5;
		int sum = 0;
		int i = 1;
		
		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("The summation of numbers is = "+ sum);
	}
}
