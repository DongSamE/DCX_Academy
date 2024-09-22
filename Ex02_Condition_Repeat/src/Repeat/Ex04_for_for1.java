package Repeat;

import java.util.Scanner;

public class Ex04_for_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q5
		int total = 0;
		int num ;
		
		for(int i = 1 ; i<=100 ; i++) {
			if(i%2==0) {
				num = i*(-1) ;
				total += num;
			}else {
				num = i;
				total += num;
			}
			
			System.out.print(" "+num);
		
		}
		System.out.println();
		System.out.println(total);
		
		//Q6
		System.out.print("Enter Integer >> ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int ten = 10 ;
		int quo = 1;
		int rem ;
		int total1 = 0 ;
		
		for(int i = 1 ; i<=8 ; i++) {
			rem = input%ten ;
			input -= rem ;
			total1 += rem/quo ;
			ten *= 10 ;
			quo *= 10 ;	
		}
		System.out.println("Total  >> " + total1);
		
		
		//	int rem ;
		//	int total1 = 0 ;
		//	
		//	for(int i = 1 ; i<=8 ; i++) {
		//		rem = input%10 ;
		//		total1 += rem;
		//		input /= 10 ;
		//	}
		//	System.out.println("Total  >> " + total1);
		
		
		//Q7
		System.out.print("Enter N>> ");
				
		int n = sc.nextInt();
		int total2 = 1;
		
		for(int i = 1 ; i<=n ; i++) {
			System.out.print(total2 + " ");
			total2 += i;
		}
		
		
		//Q8
		System.out.println("INPUT>> ");
				
		int m = sc.nextInt();
		int mul = 1;
			
		for(int i = m ; i>0 ; i--) {
			mul*=i;
		}
		System.out.print("OUTPUT>> "+ mul);
				
	}

}
