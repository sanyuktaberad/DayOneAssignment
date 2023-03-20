package com.bridelabz.arrayHandling;

public class elementOfArrayInReverseOrder {
	
	public static void main(String[] args) {
		int[] A = {78, 53, 24, 97, 56, 11, 43};
		
		System.out.println("Given array is => ");
		for (int i = 0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println("  ");
		
		System.out.println("Reverse order of givrn array is => ");
		for (int i=A.length-1;i >=0; i--) {
			System.out.print(A[i] + " ");
		}
	}

}
