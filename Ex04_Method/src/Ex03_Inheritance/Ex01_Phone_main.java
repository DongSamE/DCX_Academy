package Ex03_Inheritance;

public class Ex01_Phone_main {

	public static void main(String[] args) {
		phoneBP phone = new phoneBP();
		
		phone.Call();
		phone.message();
		
		FetureBP fp = new FetureBP();
		fp.Call();
		fp.message();
		fp.Photo();
		
		SmartBP sp = new SmartBP();
		sp.Call();
		sp.message();
		sp.Photo();
		sp.Game();
	}
}
