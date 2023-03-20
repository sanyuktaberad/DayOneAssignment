package com.bridelabz.arrayHandling;

public class smallestElementOfArray {
	
	public static void main (String[] args) {
		int[] A = { 5, 6, 8, 9, 4, 8, 9};
		int min = A[0];
		
		for (int i= 0; i<A.length; i++) {
			if(A[i] < min) {
				min = A[i];
			}
		}
		System.out.println("Smallest element present in given array: " + min);  
	}

}
