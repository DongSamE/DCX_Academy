package Ex02_2dimension;

public class Ex01_Exam1 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 21 ;
		
		//
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = count;
				count++;
				
			}
			
			
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			
			System.out.println();
		}
	}
}
