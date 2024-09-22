package Repeat;

public class Ex03_Exam1 {
	public static void main(String[] args) {
		
		int seven =77;
		int total = 0;
		
		for( int i=1 ; i<=77 ; i++) {
			total += seven*i;
			seven--;
		}
		System.out.println(total);
	}
}
