package Conditional;

import java.util.Scanner;

public class Ex06_ComplexCondition2 {

	public static void main(String[] args) {
		
		System.out.print("Enter Number >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int one = num % 10;
		int solution = 0;
		switch(one) {
		case 0: case 1: case 2: case 3: case 4:
			solution = (num/10)*10 ; 
			break;
		case 5: case 6: case 7: case 8: case 9:
			solution = ((num/10)+1)*10;
			break;
		}
		System.out.print("Answer >> "+ solution);
		

	}

}
