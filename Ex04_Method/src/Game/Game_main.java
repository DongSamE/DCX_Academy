package Game;

import java.util.Scanner;

public class Game_main {
	//Main Method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose your game!");
		System.out.println("[1]Pokemon  [2]Kirby");
		
		int input = sc.nextInt();
		if(input ==1) {
			//Grap Pokemon Util
			Pokemon game1 = new Pokemon();
			Insert(game1);
		}else if(input==2) {
			Kirby game2 = new Kirby();
			Insert(game2);
		}
		
		
		
	}
	//Insert Method
	public static void Insert(GameTitle g) {
		g.start();
	}
	
}
