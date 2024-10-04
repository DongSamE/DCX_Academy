package Ex02_ClassObject;

import java.util.Scanner;

public class Ex02_Bankexam {
	public static void main(String[] args) {
		
		Ex02_Bank Dong = new Ex02_Bank();
		
		
		/*
		Dong.deposit(5000);
		
		Dong.deposit(5000);
		
		Dong.withdraw(10000);
		
		Dong.withdraw(1000000);
		
		System.out.println("You've got : "+ Dong.showmoney()+" won");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("============= Swiss Bank ==============");
			System.out.println();
			System.out.println("              Choose Menu              ");
			System.out.println();
			System.out.println("[1]View  [2]Deposit [3]Withdraw [4]Exit");
			System.out.println();
			System.out.print(">>");
			
			
			int choice = sc.nextInt();
			
			if(choice==1) {
				System.out.println();
				Dong.showmoney();
				System.out.println();
				
			}else if(choice==2) {
				System.out.print("Money to Deposit : ");
				int deposit = sc.nextInt();
				System.out.println();
				Dong.deposit(deposit);
				System.out.println();
				
			}else if(choice==3) {
				System.out.print("Money to Withdraw : ");
				int deposit = sc.nextInt();
				System.out.println();
				Dong.withdraw(deposit);
				System.out.println();
				
			}else if(choice==4) {
				break;
				
			}else {
				System.out.println("Please Input again");
				System.out.println();
			}
		}
		
		
		
	}
}