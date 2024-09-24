package Ex03_SortAlgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04_SelectionSort3 {

	public static void main(String[] args) {
		String ls = System.lineSeparator();
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("How many tuple?");
		//Creat Array
		int num = sc.nextInt();
		int[] array = new int[num];
		for(int i=0; i<num ; i++) {
			array[i] =ran.nextInt(1000)+1;
		}
		
		int[][] dim = new int[num-1][num-1];
		
		System.out.println(Arrays.toString(array));
		//
		

		//Distance between 2 tuples
		//in 2 dimension array
		int minus ;
		for(int i = 0 ; i<array.length ; i ++) {
			for(int j = i+1 ; j<array.length ; j ++) {
				
				if(array[i]>array[j]) {
					minus = array[i]-array[j];
					if(minus!=0) {
						dim[i][j-1] = minus;
					}
				}else {
					minus = array[j]-array[i];
					if(minus!=0) {
						dim[i][j-1] = minus;
					}
				}
			}
		}
		
		System.out.println("2d Dimension") ;
		for (int i = 0; i < dim.length; i++) {
		     for (int j = 0; j < dim[i].length; j++){
		           int value = dim[i][j];
		           System.out.print(value + "\t");
		      }
		      System.out.println() ;
		}
		
		
		//minpositive
		int x = 0;
		int y = 0 ;
		Integer minPositive = null;
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                int value = dim[i][j];
                if (value > 0) {
                    if (minPositive == null || value < minPositive) {
                        minPositive = value;
                        x = j;
                        y = i;
                    }
                }
                
            }
        }
        if(x<y) {
        	System.out.println( "["+ (x+1)+" , "+ y +"]");
        }else {
        	System.out.println( "["+ y+" , "+ (x+1) +"]");
        }
       
	}
}
