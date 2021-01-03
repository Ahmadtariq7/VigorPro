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

public class CalculateBMI {
	@FXML
	private TextField h1;
	
	@FXML
	private TextField w1;
	
	@FXML
	private TextField bmi;
	
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
	
	
	public void bmi(ActionEvent event){
		
		float h , w , b;
		
		
		h = Float.parseFloat(h1.getText());
		w = Float.parseFloat(w1.getText());
		
		h = h * h;
		
		b = w/h;
		
		bmi.setText(Float.toString(b));
		
	}
		

}
