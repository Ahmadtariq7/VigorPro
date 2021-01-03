package application;

import java.io.IOException;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SignUp {
	private TextField tf_name;
	private TextField tf_age;
	private TextField tf_username;
	private PasswordField tf_password;
	
	void Register(MouseEvent event) {
		Connection conn = SqliteConnection.getInstance().Connector();
		try {
			String name = tf_name.getText();
			String age = tf_age.getText();
			String username = tf_username.getText();
			String password = tf_password.getText();
			
			Statement statement = conn.createStatement();
			int status = statement.executeUpdate("insert into users (name, age, username, password)" + " values('" + name + age + username + password + "')");
			
			if (status > 0) {
				System.out.println("User registered!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public class SignUp {
	@FXML
	private Button back1;
	
	public void changescreentoMain(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("vigorpro.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
}
