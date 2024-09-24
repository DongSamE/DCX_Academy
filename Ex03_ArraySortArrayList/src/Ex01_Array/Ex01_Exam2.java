package Ex01_Array;

import java.util.Random;

public class Ex01_Exam2 {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		Random ran = new Random();
		
		array[0] = ran.nextInt(20)+1;
		
		for(int i = 1 ; i < 5; i++ ) {
			array[i] = ran.nextInt(10)+1;
			for(int j = 0; j<i;j++) {
				if(array[i]==array[j]) {
					i--;
					}
				}
			
			}
			
		for(int i = 0 ; i < 5; i++ ) {
			System.out.print(array[i]+" ");
			}
		
	}
}
	
