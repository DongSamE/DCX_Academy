package JDBC_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex01_Join {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// JDBC
		// 1. User Input ID, PassWord, Name, Age
		System.out.print("Enter Your ID >> ");
		String id = sc.next();
		System.out.print("Enter Your PassWord >> ");
		String pw = sc.next();
		System.out.print("Enter Your Name >> ");
		String name = sc.next();
		System.out.print("Enter Your Age >> ");
		int age = sc.nextInt();

		sc.close();
		// [1] Load JDBC
		// Exception sentence
		try {
			//Load Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connect DB
			// DB ID, DB PassWord, Connect Browse
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "6532";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			if(conn!= null) {
				System.out.println("DB connect Success");
			}else {
				System.out.println("DB connect Failed");
			}

			String sql = "INSERT INTO DCX_STUDENT VALUES(?,?,?,?)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			int result = psmt.executeUpdate();
			
			if(result>0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Failed");
			}
			
			
		}catch(Exception e){
			
			
		}
		
		
		
		
		
	}
}
