package Conditional;

import java.util.Scanner;

public class Ex_HomeWork {
	
	public static void main(String[] args) {
		//Q1 Calculate Birthyear With Age
		System.out.println("Q1");
		System.out.print("Enter your Age >> ");
	
		Scanner scAge = new Scanner(System.in);
		int age = scAge.nextInt();
		
		if(age>10 && age<120) {
			System.out.println("You Born in >> " + (2024-age));
		} else {
			System.out.println("Wrong Data!");
		}
		
		//Q2 Discount from Store
		System.out.println("Q2");
		System.out.print("Enter Total Costs >> ");
		
		Scanner scCost = new Scanner(System.in);
		int Tcost = scCost.nextInt();
		
		if(Tcost<100000) {
			System.out.println("Total " + (Tcost) +" Won");
		} else {
			System.out.println("Total " + (Tcost*0.95) +" Won");
		} 
		
		//Q3 Degree Calculate
		System.out.println("Q3");
		System.out.print("Enter Degree >> ");
		
		Scanner scDeg = new Scanner(System.in);
		int degree = scDeg.nextInt();
		
		if(degree==180) {
			System.out.println("Straight Angle!");
		} else{
			System.out.println("Not Straight!");
		}
		
		//Q4 Slice pizza
		System.out.println("Q4");
		System.out.print("Enter Slices >> ");
		Scanner scSlice = new Scanner(System.in);
		int Slice = scSlice.nextInt();
		
		
		System.out.print("Enter Numbers >> ");
		Scanner scNumber = new Scanner(System.in);
		int Number = scNumber.nextInt();
		
		
		if(Slice%Number!=0) {
			System.out.println("Need " + ((Number/Slice)+1) +" Pizza");
		} else {
			System.out.println("Need " + (Number/Slice) +" Pizza");
		} 
		
		
		
		
	}

}
