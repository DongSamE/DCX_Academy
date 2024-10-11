package JDBC_Basic;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SMHRD {
	public static void main(String[] args) {
		System.out.println("==============SMHRD===============");
		System.out.println();
		System.out.println("       [1] LOGIN  [2] EXIT");
		System.out.println();
		System.out.println("==================================");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		while (true) {
			switch (input) {
			case "1":
				// login
				try {

					System.out.print("Enter ID >>");
					String id = sc.next();
					System.out.print("Enter PassWord >>");
					String pw = sc.next();
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

					if (rs.next()) {
						System.out.println("Welcome, " + rs.getString("NAME"));
						while(true) {
							System.out.println("Choose Menu");
							System.out.println("[1] regist score [2] edit score [3] check score [4] logout");
							input  = sc.next();
							if(input.equals("1")) {
								insert(id);
							}else if(input.equals("2")) {
								update(id);
							}else if(input.equals("3")) {
								check(id);
							}else if(input.equals("4")) {
								System.out.println("LogOut!");
								break;
							}else {
								System.out.println("input correct number");
							}
							
							
						}
						
						
					} else {
						System.out.println("None correct ID");
					}
				} catch (Exception e) {

				}
				break;
			case "2":// exit
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}
	}

	public static void insert(String id) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter score >>");
		int score = sc.nextInt();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connect DB
			// DB ID, DB PassWord, Connect Browse
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "6532";

			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO DCX_SCORE VALUES(?,?)";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setInt(2, score);
			
			int result = psmt.executeUpdate();
			
			if(result>0) {
				System.out.println("Insert Success");
			}else {
				System.out.println("Insert Failed");
			}
			
		}catch (Exception e){
			
		}
		
		
		

		
	}

	public static void update(String id) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter score >>");
		int score = sc.nextInt();
		
		try {
			// Load Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connect DB
			// DB ID, DB PassWord, Connect Browse
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "6532";

			Connection conn = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE DCX_SCORE SET SCORE = ? WHERE NAME = ?";

			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(2, id);
			psmt.setInt(1, score);

			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("Edit Success");
			} else {
				System.out.println("Edit Failed");
			}

		} catch (Exception e) {

		}
	}
	public static void check(String id) {
		Scanner sc = new Scanner(System.in);
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Connect DB
			// DB ID, DB PassWord, Connect Browse
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "nthnew";
			String password = "6532";

			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM DCX_SCORE WHERE NAME = ?";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			
			ResultSet rs = psmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					String user_id = rs.getString("NAME");
					int score = rs.getInt("SCORE");
					System.out.println(user_id + "\t" + score );
				}
			}else {
				
			}
			
		}catch (Exception e){
			
		}
		
		
		

		
	}
}