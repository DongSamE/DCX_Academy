package Repeat;

import java.util.Scanner;

public class Ex04_for_for {
	public static void main(String[] args) {
		
		//Q1
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("*****");
			
		}	
		System.out.println();
		
		System.out.print("How many time? >> ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		//Q2
		for(int i = 0 ; i < input ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println();
		
		
		System.out.print("How many time? >> ");
		input = sc.nextInt();
		//Q3
		for(int k = input ; k > 0 ; k--) {
			for(int l = 0; l < k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Q4
		System.out.print("How many time? >> ");
		input = sc.nextInt();
		
		for(int k = 1 ; k <= input ; k++) {
			// " "
			for(int l = input-k ; l > 0 ; l--) {
				System.out.print(" ");
				}
			// "*"
			for(int m = 1 ; m <= k ; m++){
				System.out.print("*");
				}
			System.out.println();
			}
		
		
		}
}
