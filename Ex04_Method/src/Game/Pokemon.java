package Game;

import java.util.Scanner;

public class Pokemon extends GameTitle{
	String name;
	int level =1;
	int hp = 30;
	String food;
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kirby Start");
		System.out.print("Give Kirby a name : ");
		name = sc.next();
		System.out.print("Kirby's Favorite Food: ");
		this.food = sc.next();
		
		
		
		
		do {
			//fight
			System.out.println("-----------------------------");
			System.out.println("      Kirby in Adventure");
			System.out.println("[1] fight [2] feed [3] Exit");
			System.out.println("-----------------------------");
			int choice = sc.nextInt();
			if(choice==1) {
				this.level += func.fight();
				System.out.println("Current Exp :"+level);
			}else if(choice==2){
				System.out.print("Kirby need food :");
				String feed = sc.next();
				this.level += func.eat(this.food,feed);
				System.out.println("Current Exp :"+level);
			}else if(choice==3){
				System.out.println("Exit Game!");
				System.out.println("-----------------------------");
				break;
			}else {
				System.out.println("Enter Correct Number!");
			}
			
		}while(true);
	}
}
