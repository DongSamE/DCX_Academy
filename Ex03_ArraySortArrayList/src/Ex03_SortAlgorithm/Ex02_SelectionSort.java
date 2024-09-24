package Ex03_SortAlgorithm;

import java.util.Arrays;

public class Ex02_SelectionSort {
	public static void main(String[] args) {
		//Selection Sort
		// Use Mix value & Max value
		
		int[] array = {46,2,15,86,31};
		System.out.println(Arrays.toString(array));
		int idx = 0 ;
		
		
		for(int i = 0 ; i<array.length ; i ++) {
			
			for(int j = i+1 ; j<array.length ; j ++) {
				if(array[idx]<array[j]) {
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
