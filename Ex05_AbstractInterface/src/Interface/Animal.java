package Interface;

public abstract class  Animal extends Creature{
	
	
	public void alive() {
		System.out.println("Cell is moving");
	}
	
	
	public abstract void move();
	
	
}
