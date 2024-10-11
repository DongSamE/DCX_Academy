package JDBC_Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04_SELECT {
	public static void main(String[] args) {
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

			String sql = "SELECT * FROM DCX_STUDENT";

			PreparedStatement psmt = conn.prepareStatement(sql);


			ResultSet rs = psmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					String id = rs.getString("ID");
					String name = rs.getString("NAME");
					int age = rs.getInt("AGE");
					System.out.println(id + "\t" + name + "\t"+ age);
				}
			}else {
				
			}
			
		} catch (Exception e) {

		}
	}
}
