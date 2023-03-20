package com.bridelabz.operatorsPrograms;

public class findMaxAndMin {
	
	public static void main (String[] args) {
		int a = 5;
		int b = 6;
		int c = 8;
		
		int p = a+b*c;
		int q = c+a/b;
		int r = a%b+c;
		int s = a*b+c;
		
		System.out.println("The Values of the given equation are : "+ p + ", "+ q + ", " + r +" & " + s +" respectively.");
		
		System.out.println("For maximum value");
		if (p>q && p>r && p>s) {
			System.out.println("The max value of is " + p);
		}
		else if (q>p && q>r && q>s) {
			System.out.println("The max value of is " + q);
		}
		else if (r>p && r>q && q>s) {
			System.out.println("The max value of is " + r);
		}
		else{
			System.out.println("The max value of is " + s);
		}
		
		System.out.println("For maximum value");
		if (p<q && p<r && p<s) {
			System.out.println("The min value of is " + p);
		}
		else if (q<p && q<r && q<s) {
			System.out.println("The min value of is " + q);
		}
		else if (r<p && r<q && q<s) {
			System.out.println("The min value of is " + r);
		}
		else{
			System.out.println("The min value of is " + s);
		}
	}

}
