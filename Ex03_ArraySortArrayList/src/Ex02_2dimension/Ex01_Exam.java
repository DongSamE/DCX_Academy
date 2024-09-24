package Ex02_2dimension;

public class Ex01_Exam {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 1 ;
		
		//
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = count;
				count++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
