package com.experimento;

public interface Testing1 {
	int n1=7;  
	int n2=5;
	int n3=15;
	public default void tst1(){
		System.out.println("hiikoj");

	}
	
	public static void main(String args[]) {
		int n1=7;  
		int n2=5;
		int n3=15;
		//Bitwise Operators
		 System.out.println("a&b = " + (n1 & n2)); // Bitwise AND
		 System.out.println("a|b = " + (n1 | n2)); // Bitwise OR
		 System.out.println("a^b = " + (n1 ^ n2)); // Bitwise XOR
		 System.out.println("~a = " + ~n1); // Bitwise Compliment
		 
		/*
		 * if(a<b && c<d) { System.out.println("1111111"); }else if (a>b && c>d) {
		 * System.out.println("22222222");
		 * 
		 * }else { System.out.println("333333");
		 * 
		 * }
		 * 
		 * 
		 * String result = (number > 0) ? "Positive Number" : "Negative Number";
		 */
		
		int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3): ((n2 >= n3) ? n2 : n3); /* nested ternary operator in Java. */
		 System.out.println("Largest Number: " + largest);
	}
}