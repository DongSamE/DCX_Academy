package Repeat;

import java.util.Scanner;

public class Ex02_Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a ;
		int b ;
		int c ;
		
		do {
			System.out.print("Enter A >> ");
			a = sc.nextInt();
			System.out.print("Enter B >> ");
			b = sc.nextInt();
			
			c = a-b;
			if(a==0&&b==0) {
				break;
			}
			System.out.println("Calculated >> "+ c);
					
		}while(true);
		
		
	}
}
