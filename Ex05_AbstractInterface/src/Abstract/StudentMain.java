package Abstract;

public class StudentMain {

	public static void main(String[] args) {
		Dongsam lee = new Dongsam("DongJin","DataScientist");
		lee.study();
		lee.rest();
		
		Ryu ryu = new Ryu("TaeHyun","Buisness");
		ryu.study();
		ryu.rest();
		
	}

}
