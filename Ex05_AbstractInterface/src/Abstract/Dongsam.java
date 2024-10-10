package Abstract;

public class Dongsam extends Student{
	
	String name;
	String position;
	
	public Dongsam(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	
	
	@Override
	public void study() {
		// abstract from Student , NEED TO OVERRIDE abstract Method
		System.out.println("Way to be "+this.position);
		
		
	}

}
