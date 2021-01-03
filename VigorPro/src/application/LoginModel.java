package application;


import java.io.IOException;
import java.sql.*;


public class LoginModel {
	
	Connection conection;
	
	public LoginModel() {
		conection = SqliteConnection.Connector();
		if (conection == null) {
			System.out.println("Connection not successful");
			System.exit(1);
		}
	}
	
	public boolean isDBConnected() {
		try {
			return !conection.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isLogin(String user, String pass) throws SQLException, IOException {
		Connection conn = SqliteConnection.Connector();
		Statement statement = conn.createStatement();
		
		ResultSet resultset = statement.executeQuery("select * from users where username" + " = '" + user + "' and passowrd = '" + pass + "'");
		if (resultset.next()) {
			return true;
		}
		return false;
	}
}