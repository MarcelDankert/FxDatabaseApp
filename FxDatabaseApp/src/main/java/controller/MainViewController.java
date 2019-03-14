package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController {
	@FXML
	private Button closeBtn;

	@FXML
	public void closeWindow(ActionEvent event) {
		System.exit(0);
	}
}
