package Print;

import java.util.Scanner;

public class Ex02_Input {

	public static void main(String[] args) {
		
		// System.in - input tool
		// new Scanner - Scanner tool
		// Scanner sc - DataType
		Scanner sc_num = new Scanner(System.in);
		
		//Numeric Data From User
		System.out.print("Enter the NUMVER >> ");
		int num = sc_num.nextInt();
		System.out.println(num);
		
		
		Scanner sc_str = new Scanner(System.in);
		//Character Data From User
		String str = sc_str.next();
		System.out.println("Enter the TEXT >>");
		System.out.print(str);
		
	}

}
