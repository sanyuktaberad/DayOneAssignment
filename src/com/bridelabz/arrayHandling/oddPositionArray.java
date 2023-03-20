package com.bridelabz.arrayHandling;

public class oddPositionArray {
	public static void main(String[] args) {
		int[] A = {78, 98, 35, 71, 83, 88, 93};
		
		System.out.println(" Elements of the given array present on odd position are =>");
		
		for (int i = 1; i<A.length; i = i+2) {
			System.out.print(A[i] + " ");
		}
	}

}
