package Repeat;

import java.util.Random;
import java.util.Scanner;

public class Ex01_Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		//
		int ran1 ;
		int ran2 ;
		int total ;
		int answer ;
		String YesNo ;
		
		
		//
		do {
			ran1 = (int)(Math.random()*10)+1;
			ran2 = (int)(Math.random()*10)+1;
			
			total = ran1 + ran2;
			
			System.out.print(ran1 +" + " + ran2 + " = ");
			answer = sc.nextInt();
			
			if(answer == total){
				System.out.println("Success");
				YesNo = "Y";
			}else {
				System.out.println("Fail");
				System.out.print("Will You Try Again? >> ");
				YesNo = scString.next();
				
				while(!YesNo.equals("Y") && !YesNo.equals("N")) {
					System.out.println("Input ONLY Y or N");
					System.out.print("Will You Try Again? >> ");
					YesNo = scString.next();
				}
				
			}
		}while(YesNo.equals("Y"));
		
		System.out.print("F I N I S H E D");
			
		
	}
	
}