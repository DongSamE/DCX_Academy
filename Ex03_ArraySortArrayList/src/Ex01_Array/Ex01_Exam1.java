package Ex01_Array;

import java.util.Scanner;

public class Ex01_Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		int ran ;
		
		for(int i=0;i<5;i++) {
			ran = (int)(Math.random()*100)+1;
			array[i] = ran;
			System.out.println((i+1)+".Integer  : "+array[i]);
		}
		System.out.print("Odd Integer in Array :");
		
		int odds = 0;
		for(int i=0;i<5;i++) {
			if(array[i]%2!=0) {
				System.out.print(array[i]+" ");
				odds++;
			}
		}
		System.out.println();
		System.out.println("Array have "+odds+" Odds");
		
	}

}
