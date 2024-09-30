package Ex02_ClassObject;

public class Ex01_ClassStructure {
	public static void main(String[] args) {
		//main method => Start Point of Program
		
		//1. Build Structure of Human (Class : Human.java)
		
		//2. Create Human by BluePrint
		//reference variable, object
		Ex01_Human dong = new Ex01_Human();
		//Enter Data to object
		dong.age = 27;
		dong.name = "이동진"; 
		
		dong.eat();
		dong.introduce();
		//Create new Human
		Ex01_Human ryu = new Ex01_Human();
		ryu.age = 29;
		ryu.name = "류태현";
		
		ryu.eat();
		ryu.introduce();
	}
}
