package Operator;

public class Ex05_Ternary {

	public static void main(String[] args) {
		//	Tenary(삼항)
		//	Easy Conditonal
		//	(Condition)	? (Excute1) : (Excute2) 
		//	TRUE > Excute1, FALSE > Excute2
		
		int a = 10;
		int b = 23;
		
		System.out.println( a==b ? "Same" : "Ideal" );
		
		int result = a>b ? 10:20;
		
		System.out.println( result );
		
		//if a == b message gets a+b, else a-b
		
		System.out.println( a==b ? a+b : a-b );
	}

}
