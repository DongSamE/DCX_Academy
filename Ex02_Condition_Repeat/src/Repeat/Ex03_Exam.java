package Repeat;

import java.util.Scanner;

public class Ex03_Exam {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number >>");
		int a = sc.nextInt();
		System.out.print("Enter the Maximun >>");
		int max = sc.nextInt();
		
		for( int i = 1 ; i <= max ; i++) {
			
			System.out.println(a+ " * " + i + " = " + i*a + "|");
		}
		
	}
}
