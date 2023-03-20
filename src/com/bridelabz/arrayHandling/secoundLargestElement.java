package com.bridelabz.arrayHandling;

public class secoundLargestElement {
	static int i;
	
	public static void main(String[] args) {
		int[] A = {5, 6, 7, 8, 9, 22, 13, 7};
		
		for (int i = 0; i<A.length; i++) {
			for (int j = i+1; j<A.length; j++) {
				if (A[i] < A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					
				}
			}
		}
		System.out.println("Secound largest number is " + A[i]);
	}
	

}
