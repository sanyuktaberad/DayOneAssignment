package com.bridelabz.arrayHandling;

public class largestElementOfArray {
	
	 public static void main(String[] args) {   
	        int [] A = {25, 11, 7, 75, 56, 98, 67, 88};    
	        int max = A[0];  
	         
	        for (int i = 0; i < A.length; i++) {   
	           if(A[i] > max)  
	               max = A[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }  
}
