package Ex02_ClassObject;

public class Ex03_tamagotchi_util {
	
	//[1]Status  [2]feed  [3]sleep  [4]play  [5]reset  [6]exit
	
	int Hunger = 5;
	int Happy = 5;
	int Health = 5;
	
	public void Status() {
		//Hunger
		System.out.print("Hunger "+ Hunger+"/10 :");
		for(int i = 0 ; i < Hunger ; i++) {
			System.out.print("■");
		}
		for(int i = 0 ; i < 10-Hunger ; i++) {
			System.out.print("□");
		}
		
		//Happy
		System.out.print(" Happy "+ Happy+"/10 :");
		for(int i = 0 ; i < Happy ; i++) {
			System.out.print("■");
		}
		for(int i = 0 ; i < 10-Happy ; i++) {
			System.out.print("□");
		}
		//Tired
		System.out.print(" Health "+ Health+"/10 :");
		for(int i = 0 ; i < Health ; i++) {
			System.out.print("■");
		}
		for(int i = 0 ; i < 10-Health ; i++) {
			System.out.print("□");
		}
		System.out.println();
	}
	
	public void feed() {
		if(this.Hunger<=10&& this.Hunger>=0) {
			this.Hunger+=1;
		}
		System.out.println("YumYum! Your Tamago Feel Happy!");
		System.out.println("Hunger "+ this.Hunger+"/10 :"+" Happy "+ this.Happy+"/10 :"+" Health "+ this.Health+"/10 :");
		System.out.println();
	}
	
	public void sleep() {
		if(this.Health<=10&& this.Health>=0) {
			this.Health+=2;
		}
		if(Happy<=20&& Happy>=0) {
			Happy-=2;
		}
		System.out.println("zzZ zZz Zzz");
		System.out.println("Hunger "+ this.Hunger+"/10 :"+" Happy "+ this.Happy+"/10 :"+" Health "+ this.Health+"/10 :");
		System.out.println();
	}
	
	public void play() {
		if(this.Health<=10&& this.Health>=0) {
			this.Health-=2;
		}if(this.Hunger<=10&& this.Hunger>=0) {
			this.Hunger-=2;
		}if(this.Happy<=10&& this.Happy>=0) {
			this.Happy+=3;
		}
		System.out.println("Your Tamago Feel Happy!");
		System.out.println("Hunger "+ this.Hunger+"/10 :"+" Happy "+ this.Happy+"/10 :"+" Health "+ this.Health+"/10 :");
		System.out.println();
	}
	public void reset() {
		this.Hunger = 6;
		this.Happy = 6;
		this.Health = 6;
		System.out.println("Reset Complete!");
		System.out.println("Hunger "+ this.Hunger+"/10 :"+" Happy "+ this.Happy+"/10 :"+" Health "+ this.Health+"/10 :");
		System.out.println();
	}
}
