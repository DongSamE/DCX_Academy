package Conditional;

import java.util.Scanner;

public class Ex04_SwitchCase {
	public static void main(String[] args) {
	
		//	Switch Case
		//	E(x) == value
		//	require "break" for every cases
		
		System.out.print("Enter the Month  ");
		Scanner scMonth = new Scanner(System.in);
		
		int month = scMonth.nextInt();
		
		switch(month) {
		case 1: 
		case 2: 
		case 12:
			System.out.println("Season >> Winter");
			break;
		case 3: 
		case 4:
		case 5: 
			System.out.println("Season >> Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Season >> Summer");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("Season >> Fall");
			break;
		default :
			System.out.println("Out of Range!");
		}
		
		
		// Can't calculate  boolean type
		//
		//	switch() {
		//		case (3<=month && 5>=month): 
		//			System.out.println("Season >> Spring");
		//		case (6<=month && 8>=month): 
		//			System.out.println("Season >> Summer");
		//		case (9<=month && 11>=month): 
		//			System.out.println("Season >> Fall");
		//		case (12==month || 2>=month): 
		//			System.out.println("Season >> Winter");
		//		default :
		//			System.out.println("Out of Range!");
		
		
		
		}
	}