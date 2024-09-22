package Repeat;

import java.util.Scanner;

public class Ex02_Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rndnum;
		rndnum = (int)(Math.random()*100)+1;
		int input;
		
		do {
			System.out.print("Enter Integer 1 to 100 >> ");
			input = sc.nextInt();
			
			if(input>rndnum) {
				System.out.println("Enter Smaller Integer");
			}else if(input<rndnum){
				System.out.println("Enter Bigger Integer");
			}
			
		}while(rndnum!=input);
		
		System.out.print(rndnum + " Correct!");
	}
}
