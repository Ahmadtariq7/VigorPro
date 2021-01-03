package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Browse_Exercise {
	@FXML
	private Button Push_ups;
	
	@FXML
	private Button Burpee;
	
	@FXML
	private Button Squats;
	
	@FXML
	private Button Crunches;
	
	@FXML
	private Button Bridge;
	
	@FXML
	private Button Sit_ups;
	
	@FXML
	private Button Bicycle;
	
	@FXML
	private Button Lunges;
	
	@FXML
	private Button High_knees;
	
	
	public void changescreentoPush_Ups(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("pushups.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoSquats(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("squats.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoBurpee(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("burpee.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}	
	
	public void changescreentoCrunches(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("crunches.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoBridge(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("bridge.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoSit_ups(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("situps.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoBicycle(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("bicycle.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoLunges(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("lunges.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
	public void changescreentoHigh_knees(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("highknees.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
}
