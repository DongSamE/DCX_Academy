package Conditional;

import java.util.Scanner;

public class Ex02_IfElse2 {

	public static void main(String[] args) {
		
	
		System.out.print("Enter How products you need >> ");
		Scanner sc3= new Scanner(System.in);
		int count = sc3.nextInt();
		
		if(count>=11) {
			System.out.println("Total " + (count*0.9*10000) + " won");
		} else {
			System.out.println("Total " + (count*10000) + " won");
		}
		
		System.out.print("Enter How products you need >> ");
		Scanner sc4= new Scanner(System.in);
		int count1 = sc4.nextInt();
		
		if(count1>=11) {
			System.out.println("Total " + (int)(10*10000+(count1-10)*0.8*10000) + " won");
		} else {
			System.out.println("Total " + (int)(count1*10000) + " won");
		}
			
			
	}
		
}
