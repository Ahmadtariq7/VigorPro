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

public class High_Knees {
	@FXML
	private Button back1;
	
	public void changescreentoBrowse_Exercise(ActionEvent event) throws IOException {
		Parent new_root = FXMLLoader.load(getClass().getResource("exercises.fxml"));
		Scene new_rootscene = new Scene(new_root);
		
		// Getting Stage Information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(new_rootscene);
		window.show();
		
	}
	
}