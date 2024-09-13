package Conditional;

import java.util.Scanner;

public class Ex02_IfElse1 {
	
	public static void main(String[] args) {
		
		System.out.println("==== EVERLAND RESORT ====");
		
		System.out.print("Enter your age >> ");
		Scanner sc1= new Scanner(System.in);
		int age = sc1.nextInt();
		
		System.out.print("Enter your age >> ");
		Scanner sc2 = new Scanner(System.in);
		int group = sc2.nextInt();
		
		if(age<20) {
			System.out.println("Total " + (group*5000/2) + " won");
		} else {
			System.out.println("Total " + (group*5000) + " won");
		}
		
		
	

		}
	
	}
