package Repeat;

import java.util.Scanner;

public class Ex01_exam {
	public static void main(String[] args) {
		
		System.out.print("Enter Integer >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int	total = num;
		System.out.println("Total >> " + total);
		
		while(num != -1) {
			System.out.print("Enter Integer >> ");
			num = sc.nextInt();
			total += num;
			System.out.println("Total >> " + total);
		}
		
		System.out.println("F I N I S H E D");
	}
	
}
