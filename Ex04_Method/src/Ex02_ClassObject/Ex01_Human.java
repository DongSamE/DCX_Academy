package Ex02_ClassObject;

public class Ex01_Human {
	//class 
	//field & method
	// filed : data
	// method : logic
	
	//1. Define Field
	// DataType 
	String name;
	int age;
	
	//2. Define Method
	public void eat() {
		System.out.println("Yummy!");
	}
	
	//3. Add Method
	public void introduce() {
		System.out.println("Hi! My name is " + name + ", And I'm "+age+" years old!");
	}
	
	public void hello(String a) {
		System.out.println("Hello "+ a);
	}
	
	
}
