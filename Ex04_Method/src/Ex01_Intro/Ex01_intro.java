package Ex01_Intro;
import java.util.Scanner;

public class Ex01_intro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number : ");
		int num2 = sc.nextInt();
		System.out.print("Input Operation : ");
		String op = sc.next();
		
		int con = cal(num1,num2,op);
		String oper = "";
		switch(op) {
		case "+":
			oper = "Plus";
			break;
		case "-":
			oper = "Minus";
			break;
		case "*":
			oper = "Multiple";
			break;
		case "/":
			oper = "Quontien";
			break;
		case "%":
			oper = "Remain";
			break;
		}
		
		System.out.print("You Requeset "+ oper + " : " + con);
		
		
		
		}
	

	public static int cal(int num1, int num2, String op) {
		int num = 0;
		switch(op) {
		case "+":
			num = num1 + num2;
			break;
		case "-":
			num = num1 - num2;
			break;
		case "*":
			num = num1 * num2;
			break;
		case "/":
			num = num1 / num2;
			break;
		case "%":
			num = num1 % num2;
			break;
		}
		
		return num;
	}
}
