package Ex02_2dimension;

import java.util.Arrays;

public class Ex01_Intro {
	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		int count = 1 ;
		
		
		
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0; j < 5 ; j++) {
				arr[i][j] = count;
				count++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
