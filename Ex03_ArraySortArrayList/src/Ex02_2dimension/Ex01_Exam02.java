package Ex02_2dimension;

public class Ex01_Exam02 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 21 ;
		//array
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		//print
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				if(i%2==0) {
					System.out.print(arr[i][j]+"\t");
				}else{
					System.out.print(arr[i][4-j]+"\t");
				}
			}
			System.out.println();	
		}
	}
}
