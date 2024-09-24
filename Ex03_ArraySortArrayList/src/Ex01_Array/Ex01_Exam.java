package Ex01_Array;

import java.util.Scanner;

public class Ex01_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Integers? :");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print("Enter number "+(i+1) + " :");
			int num = sc.nextInt();
			array[i] = num;
		}
		System.out.print("Entered Numbers :");
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]+" ");
		}
		//Max
		int Max = array[1];
		for(int i = 0; i < array.length ; i++) {
			int num = array[i];
			if(num>Max) {
				Max = num;
			}
		}
		//Min
		int Min = array[1];
		for(int i = 0; i < array.length ; i++) {
			int num = array[i];
			if(num<Min) {
				Min = num;
			}
		}
		//Sum
		int Sum = 0;
		for(int i = 0; i < array.length ; i++) {
			Sum+=array[i];
		}
		//Average
		double Aver =  Sum/ (double)array.length ;
		
		System.out.println();
		System.out.println("Maximum	: " +Max);
		System.out.println("Minimum	: " +Min);
		System.out.println("Sum	: " +Sum);
		System.out.println("Average	: " +Aver);

	}

}
