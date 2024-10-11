package JDBC_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05_Login {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID >>");
			String id  = sc.next();
			System.out.println("Enter PassWord");
			String pw  = sc.next();
			
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

			
			
			String sql = "SELECT * FROM DCX_STUDENT WHERE ID = ? AND PASSWORD = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);


			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("Welcome, "+ rs.getString("NAME"));
			}else {
				System.out.println("None correct ID");
			}
			
		} catch (Exception e) {

		}

	}

}
