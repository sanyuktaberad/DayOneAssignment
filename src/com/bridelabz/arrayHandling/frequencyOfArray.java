package com.bridelabz.arrayHandling;

public class frequencyOfArray {
	static int i, j;
	
	public static void main(String[] args) {
		int[] A = {7, 4, 6, 9, 3, 5, 9, 3, 6, 6, 9, 5};
		int[] fr = new int [A.length];
		int visited = -1;
		for(int i=0; i<A.length; i++) {
			int count = 1;
			for (int j = i+1; j<A.length; j++) {
				if (A[i] == A[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
			}
		for (int i = 0; i<fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println("Frequency of " + A[i] + " is " + fr[i]);
			}
			
		}
	}

}
