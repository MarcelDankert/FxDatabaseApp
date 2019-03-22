package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class DbController {
	@FXML
	private Button closeBtn;
	@FXML Button loginBtn;
	
	@FXML PasswordField passwortTf;
	@FXML TextField benutzerTf;

	@FXML
	public void closeWindow(ActionEvent event) {
		System.exit(0);
	}

	@FXML public void reset(ActionEvent event) {
		
	}

	@FXML public void login(ActionEvent event) {
		
	}
}
