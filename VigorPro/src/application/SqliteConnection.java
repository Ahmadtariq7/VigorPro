package application;

import java.sql.*;

public class SqliteConnection {
	
	private SqliteConnection() {
		
	}
	
	public static SqliteConnection getInstance() {
		return new SqliteConnection();
	}
	
	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:vigorpro.db");
			return conn;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
			// TODO: handle exception
		}
	}
}
