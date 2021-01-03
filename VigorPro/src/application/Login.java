package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class Login implements Initializable {
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	private Button Login;
	
	@FXML
	private Button back1;
	
	
	public LoginModel loginmodel = new LoginModel();
	
	@FXML
	private Label isConnected;
	
	
	public void initialize(URL location, ResourceBundle resources) {
		if(loginmodel.isDBConnected()) {
			isConnected.setText("Connected");
		}
		else {
			isConnected.setText("Not Connected");
		}
	}
	
	public void changescreentoMain(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("vigorpro.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoexercise(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("exercises.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	
	public void login(ActionEvent event) throws IOException {
		try {
			if(username.getText().equals("user") && password.getText().equals("1234")) {
				//loginmodel.isLogin(username.getText(), password.getText())
				//lblStatus.setText("Login Successful");
				
				Parent new_root = FXMLLoader.load(getClass().getResource("exercises.fxml"));
				Scene new_rootscene = new Scene(new_root);
				
				// Getting Stage Information
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				window.setScene(new_rootscene);
				window.show();
				
			}
			else
			{
				lblStatus.setText("Login Failed");
			}
//		} catch (SQLException e) {
//			isConnected.setText("Username and Password not Correct");
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
