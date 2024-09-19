package Repeat;

import java.util.Scanner;

public class Ex01_intro {
	public static void main(String[] args) {
		
		
		
		// while
		//	while(condition){
		//		Execute
		//	}
		System.out.print("Enter the Integer >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num<10) {
			System.out.print("Enter the Integer >> ");
			num = sc.nextInt();
		}
		
		System.out.print("F I N I S H E D");
		
	}
}
