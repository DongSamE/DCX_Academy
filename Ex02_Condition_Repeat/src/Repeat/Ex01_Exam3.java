package Repeat;

import java.util.Scanner;

public class Ex01_Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Weight Now >> ");
		int now = sc.nextInt();
		System.out.print("Weight To >> ");
		int target = sc.nextInt();
		
		int i = 1;
		
		System.out.print(i+" week reduced >> ");
		int weight = sc.nextInt();
		now -= weight;
		
		while(target<=now) {
			i += 1;
			System.out.print(i+" week reduced >> ");
			weight = sc.nextInt();
			now -= weight;
			
		}
		
		System.out.println("Congraturation! You Win!");
	}
	
}
