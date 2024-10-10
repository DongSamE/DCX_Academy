package Interface;

public class Whale extends Animal implements Swim{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Whale Swims with tale");
	}

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		System.out.println("어푸어푸");
	}

}
