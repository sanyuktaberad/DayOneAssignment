package com.bridelabz.ifElseStatement;
import java.util.Scanner;

public class displayUnitAndTenHundred {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the number you want into world : ");
		int n = a.nextInt();
		
		if (n == 1 ) {
			System.out.println("one");
		}
		else if (n == 10){
			System.out.println("ten");
		}
		else if (n == 10){
			System.out.println("hundred");
		}
		else {
			System.out.println("Invalid Input.....");
		}
	}
}
