package Conditional;

import java.util.Scanner;

public class Ex02_IfElse {

	public static void main(String[] args) {
		
		
		System.out.print("Enter your grade >> ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if(grade>=60) {
			System.out.println("You Passed!");
		} else {
			System.out.println("You Failed");
		};
		
	

	}

}
