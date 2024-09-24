package Ex01_Array;

public class Ex01_Intro {
	public static void main(String[] args) {
		
		// Array
		// Structure concat Same Type of Data
		//
		// 1.Same DataType
		// 2.Index Number (0 to N, ++)
		// 3.fixed size
		
		int[] array = {6,3,8,4,2};
		int big = 0;
		int num1 ;
		
		
		for(int i = 0; i < array.length ; i++) {
			num1 = array[i];
			if(num1>big) {
				big = num1;
			}
		}
		System.out.println("Max number = "+ big );
		
	}
}
