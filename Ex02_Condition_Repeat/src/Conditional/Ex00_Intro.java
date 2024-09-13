package Conditional;

import java.util.Scanner;

public class Ex00_Intro {

	public static void main(String[] args) {
		
		//Conditional : Contents Conditional -> Launch code
		//			  : Faild 	 Conditional -> Ignore code
		//	Simple IF
		//		Segment
		//			(1) Compare
		//			(2-1) If TRUE -> {} -> Break
		//			(2-2) IF False->       Break
		
		
		System.out.print("Enter integer >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if(num1>10) {
			System.out.println("Bigger than 10");
		}
		
		
		//	If ~ Else
		//		if(Condition) {
		//			Code launch when it's TRUE
		//		}	else {
		//			Code launch when it's FALSE
		//		}
		
		
		
		
	}

}
