package com.bridelabz.arrayHandling;

public class acendingOrderOfArray {
	
	public static void main(String[] args) {
		int [] A = {7, 3, 7, 8, 1, 8, 5, 2};
		System.out.println("Given Array =>");
		
		for(int i = 0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(" ");
		for (int i =0; i<A.length;i++) {
			for (int j = i+1; j<A.length; j++) {
				if (A[i]>A[j]) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				}
			}
		}
		System.out.println("Acending order of array => ");
		for (int i = 0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
	}

}
