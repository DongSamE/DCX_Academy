package Game;

import java.util.Random;

public class func {
	//fight method
	public static int fight() {
		Random random = new Random();
		System.out.println("Faced Enemy!");
		int kirby = random.nextInt(5);
		int enemy = random.nextInt(5);
		System.out.println("Kirby : "+kirby +" VS "+ "Enemy : "+enemy );
		int exp;
		
		if(kirby > enemy) {
			exp = 30;
			System.out.println("Kirby Win! +30 Exp");
		}else if(kirby < enemy) {
			exp = 5;
			System.out.println("Kirby Lose! +5 Exp");
		}else {
			exp = 15;
			System.out.println("Kirby Draw! +15 Exp");
		}
		
		return exp;
	}
	public static int eat(String favor, String eat) {
		int exp;
		
		if(favor.equals(eat)) {
			exp = 50;
			System.out.println("Kirby Likes "+eat);
		}else {
			exp = -10;
			System.out.println("Kirby Hates "+eat);
		}
		
		return exp;
	}
	
}
