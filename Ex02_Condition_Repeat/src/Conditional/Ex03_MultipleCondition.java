package Conditional;

import java.util.Scanner;

public class Ex03_MultipleCondition {
	public static void main(String[] args) {
		
		// Multiple If condition
		//
		//	if(condition1){
		//		code1;
		//	}else if{
		//		code2;
		//	}else{
		//		code3;
		//	}
		
		System.out.print("Enter Your Score >> ");
		Scanner scScore = new Scanner(System.in);
		
		int totalScore = scScore.nextInt();
		String grade = "a";
		
		if(totalScore>=0 && totalScore<=100){
			if(totalScore >= 90){
				grade = "A" ;
				System.out.print("Your Grade is >> "+ grade);
			}else if(totalScore >= 80){
				grade = "B";
				System.out.print("Your Grade is >> "+ grade);
			}else if(totalScore >= 70){
				grade = "C";
				System.out.print("Your Grade is >> "+ grade);
			}else {
				grade = "Failed";
				System.out.print("Your Grade is >> "+ grade);
			}
		}else {
			System.out.println("Wrong Score!");
		}
		
		
		
		
	}
}
