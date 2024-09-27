package Ex01_Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_Exam04 {

	
	// To print
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Input Second Number : ");
		int num2 = sc.nextInt();
		
		
	
		System.out.println(GetPerfectNumber(num1, num2));
		
	}
	
	
	
	// To calculate
	
	
	 public static String GetPerfectNumber(int num1, int num2) {
	        int[] arr = new int[(num2 - num1 + 1)]; // Allocate based on range
	        int count = 0;
	        
	        for (int i = num1; i <= num2; i++) {
	            int sum = 0;
	            // Calculate sum of proper divisors
	            for (int j = 1; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    sum += j;
	                }
	            }
	            if (i == sum) {
	                arr[count] = i;
	                count++;
	            }
	        }
	        
	        // Return array of perfect numbers, trimmed to the actual count
	        return Arrays.toString(Arrays.copyOf(arr, count));
	    }

}
