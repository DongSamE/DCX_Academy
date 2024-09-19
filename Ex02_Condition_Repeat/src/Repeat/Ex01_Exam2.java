package Repeat;

import java.util.Scanner;

public class Ex01_Exam2 {
	public static void main(String[] args) {
		String ls = System.lineSeparator();
		
		
		System.out.print("Enter Integer >> ");
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		// Count odd and pair
		int even = 0 ;
		int odd = 0 ;
		//
		while(num != -1) {
			
			if(num%2==0) {
				even ++;
			}else {
				odd ++;
			}
			System.out.println("Pair >> " + even + ls + "Odd >> "+ odd);
			System.out.print("Enter Integer >> ");
			num = sc.nextInt();
		}
		
		System.out.println("F I N I S H E D");
	}
}
