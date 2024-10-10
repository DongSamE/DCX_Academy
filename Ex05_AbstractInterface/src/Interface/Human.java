package Interface;

public class Human extends Animal implements Speak,Swim{

	@Override
	public void move() {
		System.out.println("Human Walk with Feet");
		
	}
	
	public void use() {
		System.out.println("Human uses tool");
		
	}

	@Override
	public void speaking() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}

	@Override
	public void barking() {
		// TODO Auto-generated method stub
		System.out.println("H!e!l!l!o! W!o!r!l!d!");
	}

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		System.out.println("어푸어푸");
	}
	
}