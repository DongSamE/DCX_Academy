package Ex03_SortAlgorithm;

import java.util.Arrays;

public class Ex01_BubbleSort {

	public static void main(String[] args) {
		// Bubble Sort : Easy code, Low Speed
		int[] array = {82,45,25,12,7};
		System.out.println(Arrays.toString(array));
		
		for(int i = 1 ; i <= array.length; i++) {
			for(int j= 0 ; j < array.length-i; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
