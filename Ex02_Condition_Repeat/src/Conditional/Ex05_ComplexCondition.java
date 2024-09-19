package Conditional;

import java.util.Scanner;

public class Ex05_ComplexCondition {
	public static void main(String[] args) {
		// Vending Machine
		String ls = System.lineSeparator();
		
		// get budget
		System.out.print("Enter the Budget  >>");
		Scanner scMoney = new Scanner(System.in);
		int Money = scMoney.nextInt();
		
		
		System.out.println("Choose Drink");
		System.out.println("==========================================");
		System.out.println("1.Cola(700)   2.Sprite(800)   3.Water(500)");
		System.out.println("==========================================");
		System.out.print(">>");
		
		//choose drink
		Scanner scDrink = new Scanner(System.in);
		int Drink = scDrink.nextInt();
		System.out.println("."+ ls + "." + ls + ".");
		//calculate
		int price = 0;
		//switch~case condition
		int thousand = 0;
		int fiveHunds = 0;
		int hunds = 0;
		switch(Drink) {
		case 1: 
			price = 700;
			if(price>Money) {
				thousand = (Money)/1000;
				fiveHunds = ((Money)-(thousand*1000))/500;
				hunds = ((Money)-(thousand*1000)-(fiveHunds*500))/100;
				System.out.println("Not Enough Money!" + ls + "Change >> " + Money  +ls + "1,000 won > " + thousand + " |  500 won > " + fiveHunds + " |  100 won > " + hunds);
			} else {
				thousand = (Money-price)/1000;
				fiveHunds = ((Money-price)-(thousand*1000))/500;
				hunds = ((Money-price)-(thousand*1000)-(fiveHunds*500))/100;
				System.out.println("Success! " + ls + "Change >> "+ (Money-price) +ls + "1,000 won > " + thousand + "|  500 won > " + fiveHunds + "|  100 won > " + hunds);
			}
			break;
		case 2: 
			price = 800;
			if(price>Money) {
				thousand = (Money)/1000;
				fiveHunds = ((Money)-(thousand*1000))/500;
				hunds = ((Money)-(thousand*1000)-(fiveHunds*500))/100;
				System.out.println("Not Enough Money!" + ls + "Change >> " + Money +ls + "1,000 won > " + thousand + " |  500 won > " + fiveHunds + " |  100 won > " + hunds);
			} else {
				thousand = (Money-price)/1000;
				fiveHunds = ((Money-price)-(thousand*1000))/500;
				hunds = ((Money-price)-(thousand*1000)-(fiveHunds*500))/100;
				System.out.println("Success! " + ls + "Change >> "+ (Money-price) +ls + "1,000 won > " + thousand + " |  500 won > " + fiveHunds + " |  100 won > " + hunds);
			}
			break;
		case 3:
			price = 500;
			if(price>Money) {
				thousand = (Money)/1000;
				fiveHunds = ((Money)-(thousand*1000))/500;
				hunds = ((Money)-(thousand*1000)-(fiveHunds*500))/100;
				System.out.println("Not Enough Money!" + ls + "Change >> " + Money  +ls + "1,000 won > " + thousand + " |  500 won > " + fiveHunds + " |  100 won > " + hunds);
			} else {
				thousand = (Money-price)/1000;
				fiveHunds = ((Money-price)-(thousand*1000))/500;
				hunds = ((Money-price)-(thousand*1000)-(fiveHunds*500))/100;
				System.out.println("Success! " + ls + "Change >> "+ (Money-price) +ls + "1,000 won > " + thousand + " |  500 won > " + fiveHunds + " |  100 won > " + hunds);
			}
			break;
		default :
			System.out.println("Choose right Number!" + ls + "Change >> " + Money  +ls + "1,000 won > " + thousand + " |  500 won > " + fiveHunds + " |  100 won > " + hunds);
		}
	
	}
}
