package Ex01_Intro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06_Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Your Array Length : ");
		int length = sc.nextInt();
		
		int[] array = new int[length];
		
		for(int i = 0 ; i < length ; i++) {
			System.out.print("Enter Value No."+(i+1)+ ": ");
			int value = sc.nextInt();
			array[i] = value;
		}
		
		
		
		System.out.println("Mean : "+ArraySum(array));
		
		arrayToString(array);
		
	}
	
	
	
	// To calculate
	
	
	 public static double ArraySum(int[] array) {
	        double mean = 0;
	        int sum = 0;
	        
	        for (int i = 0; i < array.length ; i++) {
	            sum += array[i];
	            }
	        mean = sum/(double)array.length;
	        // Return array of perfect numbers, trimmed to the actual count
	        
	        return mean;
	    }
	 
	 public static void arrayToString(int[] array) {
	        
	        for (int i = 0; i < array.length ; i++) {
	        	
	        	if(i==0) {System.out.print("[ "+array[i]+", ");
	        	}else if(i==(array.length-1)) {
	        		System.out.print(array[i]+" ]");
	        	}else {
	        		System.out.print(array[i]+", ");
	        	}
	        }
	        
	    }

}
