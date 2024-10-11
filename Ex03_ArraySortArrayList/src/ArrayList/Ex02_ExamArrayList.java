package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_ExamArrayList {
	public static void main(String[] args) {
		
		ArrayList MP3 = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		String select = "0";
		
		while(true) {
			System.out.println("< = Now Playing = > ");
			System.out.println(MP3);
			System.out.println("=======================");
			
			System.out.println("Choose Menu");
			System.out.println("[1]Add Music  [2]Delete Music [3]Exit >>");
			select = sc.next();
			
			if(select.equals("1")) {
				System.out.println("Enter Music Name >> ");
				String title = sc.next();
				System.out.println("Enter Order >> ");
				int place = sc.nextInt();
				
				MP3.add(place,title);
				System.out.println("Success! ");
			}else if(select.equals("2")) {
				
				System.out.println("Enter Music Name >> ");
				String title = sc.next();
				int place = 0;
				for(int i = 0; i < MP3.size() ; i++) {
					if(title.equals(MP3.get(i))) {
						place = i;
					}
				}
				
				MP3.remove(place);
				System.out.println("Success! ");
			}else if(select.equals("3")) {
				
				System.out.println("Quit! ");
				break;
			}else {
				System.out.println("Enter Right Number! ");
			}
			
			
			
		}
		
		
		
		
		
	}
}
