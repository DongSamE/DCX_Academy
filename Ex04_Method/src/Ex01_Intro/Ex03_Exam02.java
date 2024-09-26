package Ex01_Intro;

import java.util.Scanner;

public class Ex03_Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input First Integer : ");
		int num1 = sc.nextInt();
		System.out.print("Input First Integer : ");
		int num2 = sc.nextInt();
		
		boolean result = isDivisor(num1,num2);
		
		System.out.println(result);
		
	}
	
	public static boolean isDivisor(int num1, int num2) {
		return (num1%num2==0); 
	}

}
