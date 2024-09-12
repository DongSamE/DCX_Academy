package Operator;

import java.util.Scanner;

public class Ex03_Arithmectic_Example {

	public static void main(String[] args) {
		//	discards numbers below the hundredth place
		//	2 integer from user
		
		//	Segment
		//	1. Input tool
		//	2. Enter 1 integers
		//	3. discard
		
		//	Push & Pull
		System.out.print("Enter the number  ->");
		Scanner sc 	= new Scanner(System.in);
		int num1 	= sc.nextInt();
		double num2 = num1/100;
		int num3 	= (int)num2;
		int result1 	=  num3*100;
		//	
		int result2 	= num1- (num1%100);
		int result3 	= num1/100*100;
		//	String Convert
		String str1 = Integer.toString(num1);
		int length 	= str1.length();
		String result = str1.substring(length - 2);
		int b 		= Integer.parseInt(result);
		int StrConv = num1 - b ;
		
		//	Print
		System.out.println("discarded number : " + result1);
		System.out.println("discarded number : " + result2);
		System.out.println("discarded number : " + result3);
		System.out.println("discarded number : " + StrConv);		

	}
	
}