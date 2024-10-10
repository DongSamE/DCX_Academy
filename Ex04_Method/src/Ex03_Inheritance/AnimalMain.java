package Ex03_Inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
	
		a.cry();
		d.cry();
		c.cry();
		
		d.walk();
		c.sleep();
		
		//Upcast Dog to Animal
		Animal dogUp = new Dog();
		dogUp.cry();
		
		
	}

}
