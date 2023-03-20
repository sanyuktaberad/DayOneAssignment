package com.bridelabz.day1Problem;
import java.util.Scanner;

public class twoStringsEqual {
	static Scanner a = new Scanner(System.in);
	
	public static void main (String[]args) {
		
		System.out.println("Enter first string");
		String a1 = a.next();
		
		System.out.println("Enter first string");
		String a2 = a.next();
		
		if (a1.equals(a2)) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
	
	}
}
