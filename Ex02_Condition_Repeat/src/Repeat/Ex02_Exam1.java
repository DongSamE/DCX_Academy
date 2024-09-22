package Repeat;

import java.util.Scanner;

public class Ex02_Exam1 {
	public static void main(String[] args) {
		
		String UserId;
		String UserPw;
		int i = 1;
		
		do{
			//get id		
			System.out.print("Enter your ID		>> ");
			Scanner scId = new Scanner(System.in);
			UserId = scId.next();
			//get password
			System.out.print("Enter your Password	>> ");
			Scanner scPw = new Scanner(System.in);
			UserPw = scPw.next();
			
			//success
			if( UserId.equals("test") && UserPw.equals("test1234") ) {
				System.out.println("Log in Success!");
				break;
			}else{
					if(i<3){
						System.out.println("Log in Failed!");
					} else {
						//out of time
						System.out.println("Log in Failed!");
						System.out.println("Out Of Time!");
					}
			}
			//repeater
			i++;
			
			}while(i<4);
		
		
	}
}