package com.bridelabz.day1Problem;

public class sumUsingCLI {
	public static void main(String[] args) {
		int sum=0, count = 0, number;
		for(int i=0; i<args.length;i++) {
			try {number = Integer.parseInt(args[i]);
			sum = sum+number;
				
			}
			catch(NumberFormatException e) {
				count++;
			}
			
		}
		
		System.out.println("Sum of the numbers are = "+ sum);
		System.out.println("Invalid integers are = "+ count);

	}

}
