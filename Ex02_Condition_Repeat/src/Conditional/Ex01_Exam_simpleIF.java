package Conditional;

import java.util.Scanner;

public class Ex01_Exam_simpleIF {
	public static void main(String[] args) {
		
		
		System.out.print("Enter Age >> ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("Adult");
		} else {
			System.out.println("Kid");
		}
		
		
		System.out.print("Enter Integer >> ");
		Scanner sc0 = new Scanner(System.in);
		int num = sc0.nextInt();
		
		if(num%5==0&&num%3==0) {
			System.out.println("Multiple of 3 & 5");
		} else {
			System.out.println("NOT Multiple of 3 & 5");
		}
		
		
	}
}


