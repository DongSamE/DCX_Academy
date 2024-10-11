package JDBC_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02_Quit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// JDBC
		// 1. User Input ID, PassWord, Name, Age
		System.out.print("Enter Your ID >> ");
		String id = sc.next();
		System.out.print("Enter Your PassWord >> ");
		String pw = sc.next();

		sc.close();
		// [1] Load JDBC
		// Exception sentence
		try {
			// Load Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connect DB
			// DB ID, DB PassWord, Connect Browse
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "6532";

			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("DB connect Success");
			} else {
				System.out.println("DB connect Failed");
			}

			String sql = "DELETE FROM DCX_STUDENT WHERE ID = ? AND PASSWORD = ?";

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw); 

			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("Delete Success");
			} else {
				System.out.println("Delete Failed");
			}

		} catch (Exception e) {

		}
	}
}
