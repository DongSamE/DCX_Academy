package Abstract;

public class Ryu extends Student{
	
	String name;
	String position;
	
	public Ryu(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	
	
	@Override
	public void study() {
		// abstract from Student , NEED TO OVERRIDE abstract Method
		System.out.println("Way to be "+this.position);
		
		
	}
}
