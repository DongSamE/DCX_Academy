package Ex01_Intro;

import java.util.Scanner;

public class Ex02_Exam01 {
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input First Integer : ");
		int num1 = sc.nextInt();
		System.out.print("Input Second Integer : ");
		int num2 = sc.nextInt();
		
		int con = GetAbsoluteValue(num1,num2);
		
		System.out.print("You Answer : " + con);
		}
	

	public static int GetAbsoluteValue(int num1, int num2) {

		if(num1>num2) {
			return num1-num2;
		}else {
			return num2-num1;
		}
	}
}
