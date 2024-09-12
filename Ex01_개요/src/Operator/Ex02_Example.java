package Operator;

import java.util.Scanner;

public class Ex02_Example {

	public static void main(String[] args) {
		//	2 integer from user
		//	+, -, *, /  print(real number)
		
		//	Segment
		//	1. Input tool
		//	2. Enter 2 integers
		//	3. Print
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number ->");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number ->");
		int num2 = sc.nextInt();
		
		int plus = num1+num2;
		int minus = num1-num2;
		int times = num1*num2;
		double divide = (double)num1/ num2;
		
		
		System.out.println("Plus	 ->  "+ plus);
		System.out.println("Minus	 ->  "+ minus);
		System.out.println("Times	 ->  "+ times);
		System.out.println("Divide	 ->  "+ divide);
	}

}
