package com.bridelabz.ifElseStatement;
import java.util.Scanner;

public class digitNumberToWorld {

	public static void main (String[] args){
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the single digit number you want into world : ");
		int n = a.nextInt();
		
		if (n == 0) {
			System.out.println("zero");
		}
		else if(n == 1) {
			System.out.println("one");
		}
		else if(n == 2) {
			System.out.println("two");
		}
		else if(n == 3) {
			System.out.println("three");
		}
		else if(n == 4) {
			System.out.println("four");
		}
		else if(n == 5) {
			System.out.println("five");
		}
		else if(n == 6) {
			System.out.println("six");
		}
		else if(n == 7) {
			System.out.println("seven");
		}
		else if(n == 8) {
			System.out.println("eight");
		}
		else if(n == 9) {
			System.out.println("nine");
		}
		else {
			System.out.println("Invalid Input....");
		}
	}
}
