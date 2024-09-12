package Operator;

import java.util.Scanner;

public class Ex06_Example2 {

	public static void main(String[] args) {
		
		//	Discriminate Entered Integer is Even or Odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer >>  ");
		int num1 = sc.nextInt() ;
		String result = num1%2==0 ? "Even":"Odd";
		System.out.println(num1 + " is " + result);
		
		
		//	Compare Two Entered Integer
		System.out.print("Enter First 	Integer >>  ");
		int num2 = sc.nextInt() ;
		System.out.print("Enter Second	Integer >>  ");
		int num3 = sc.nextInt() ;
		int resultCom = num2>num3 ? num2-num3:num3-num2;
		System.out.println("Difference between two number : " + resultCom);
		
		//	Quotient divided by 5
		System.out.print("Enter count of Balls >>  ");
		int num4 = sc.nextInt() ;
		
		int resultQuo = num4%5==0 ? (num4/5) : (num4/5+1);
		System.out.println("You need : " + resultQuo + " Basket");
	}

}