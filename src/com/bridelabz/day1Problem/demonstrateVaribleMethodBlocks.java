package com.bridelabz.day1Problem;

public class demonstrateVaribleMethodBlocks {
	static int a;									//static variable
	
	public static void method() {					//static block
		System.out.println("This is Static method.");
	}
	
	public static void main(String[] args) {		//main method
		System.out.println(a);
		method();
		
	}

}
