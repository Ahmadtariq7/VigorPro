package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Random;

public class Maincontroller {
	@FXML
	private Button calbmi;
	
	@FXML
	private Button login;
	
	@FXML
	private TextField t1;
	
//	@FXML
//	private Label t2;
	
	@FXML
	private Button next;
	
	public void quotes(ActionEvent event) throws IOException{
		Random rand = new Random();
		int upperbound = 5;
		int random_int = rand.nextInt(upperbound);
		
		String arr[] = new String[5];
		arr[0] = "Don't Give Into The Strive";
		arr[1] = "Work Hard and Play Hard";
		arr[2] = "You Can Do It";
		arr[3] = "Failure Is The First Step Into Success";
		arr[4] = "An Apple A Day Keeps The Doctor Away";
		
		
//		t1.setText("Hope having a goodasdasdad day!");
		t1.setText(arr[random_int]);
	}
	
	
	public void changescreentoBMI(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("calculateBMI.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentologin(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentosignup(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("signup.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	
	
}
