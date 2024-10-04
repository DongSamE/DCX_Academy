package Ex02_ClassObject;

import java.util.Scanner;

public class Ex03_tamagotchi {
	public static void main(String[] args) {
		
		Ex03_tamagotchi_util tama = new Ex03_tamagotchi_util();
		while(true) {
		System.out.println("•────────────────────────────────────────────────────────────────•");
		System.out.println("                            Tamagotchi                            ");
		System.out.println("•────────────────────────────────────────────────────────────────•");
		System.out.println("Choose Menu");
		System.out.println("[1]Status    [2]feed     [3]sleep    [4]play     [5]reset   [6]exit");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if(choice==1) {
			tama.Status();
			
		}else if(choice==2) {
			tama.feed();
			
		}else if(choice==3) {
			tama.sleep();
			
		}else if(choice==4) {
			tama.play();
		}else if(choice==5) {
			tama.reset();
		}else if(choice==6) {
			break;
			
		}else {
			System.out.println("Please Input again");
			System.out.println();
		}
	
		
		
		
		
		
		
		}
		
		
		
		
	}
}
