package Ex02_ClassObject;

public class Ex02_Bank {
	
	//make money untouchable
	private int money = 430000000;
	
	//deposit
	public void deposit(int n) {
		money += n;
		System.out.println("Deposit Complete! : "+ money+" won");
	}
	
	
	//withdraw
	public void withdraw(int n) {
		money -= n;
		System.out.println("Withdraw Complete! : "+ money+" won");
	}
	
	
	//
	public int showmoney() {
		System.out.println("You've got : "+ money+" won");
		return money;
	}
	
	
	
}
