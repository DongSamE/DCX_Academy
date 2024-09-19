package Repeat;

import java.util.Scanner;

public class Ex01_Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Weight Now >> ");
		int now = sc.nextInt();
		System.out.print("Weight Goal >> ");
		int goal = sc.nextInt();
		//
		int i = 1;
		int input = 0;
		// DO~WHILE need ';' 
		do {
			System.out.print(i + "  week reduced >> ");
			input = sc.nextInt();
			now -= input;
			i++;
		}while(now > goal);
		
		System.out.println(now + " kg! You did it!");
	}
}
