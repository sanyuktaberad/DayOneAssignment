package com.bridelabz.arrayHandling;

public class duplicateElement {
	public static void main(String[] args){
		int [] A = {56, 52, 10, 45, 67, 56, 10, 67, 55, 55, 52};
		
		System.out.println("Duplicate present in the given array is => ");
		
		for (int i = 0; i<A.length; i++) {
			for (int j = i+1; j<A.length; j++) {
				if (A[i] == A[j]) {
					System.out.print(A[j] + " ");
				}
			}
		}
	}

}
