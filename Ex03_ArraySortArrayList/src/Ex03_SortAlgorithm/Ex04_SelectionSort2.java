package Ex03_SortAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class Ex04_SelectionSort2 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		
		Random ran = new Random();
		for(int i=0; i<10 ; i++) {
			array[i] =ran.nextInt(100)+1;
		}
		
		
		System.out.println(Arrays.toString(array));
	
		
		
		for(int i = 0 ; i<array.length ; i ++) {
			int idx = i ;
			for(int j = idx ; j<array.length ; j ++) {
				if(array[idx]>array[j]) {
					idx = j;
				}
				System.out.println(idx);
			}
			int temp = array[i];
			array[i]=array[idx];
			array[idx] = temp;
			System.out.println(Arrays.toString(array));
		}
	}
}
