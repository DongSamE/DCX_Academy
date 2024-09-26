package Ex01_Intro;

import java.util.Scanner;

public class Ex04_Exam03 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Input Number : ");
			int num1 = sc.nextInt();
			
			for(int i = 1 ; i <= num1 ; i++) {
				if(num1%i==0) {
					System.out.print(i+" ");
				}
			}
			
			
			int result = GetSumOfDivisor(num1);
			System.out.println();
			System.out.println("Sum Of Divisor : "+ result);
			
		}
		
		public static int GetSumOfDivisor(int num1) {
			int sum = 0;
			for(int i = 1 ; i <= num1 ; i++) {
				if(num1%i==0) {
					sum+=i;
				}
			}
			return sum; 
		}

	}
