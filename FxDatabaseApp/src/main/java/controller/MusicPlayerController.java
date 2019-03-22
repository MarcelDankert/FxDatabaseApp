package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MusicPlayerController {

	@FXML
	private Button openBtn;

	@FXML
	private Button playBtn;

	@FXML
	private Button pauseBtn;

	@FXML
	private Button quitBtn;

	@FXML
	private Button closeBtn;

	@FXML
	void closeWindow(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void openDbView(ActionEvent event) {
		System.out.println("Open pressed");
	}

	@FXML
	void pauseMusic(ActionEvent event) {
		System.out.println("Pause pressed");
	}

	@FXML
	void playMusic(ActionEvent event) {
		System.out.println("Play pressed");
	}

	@FXML
	void quitPlayer(ActionEvent event) {
		System.exit(0);
	}

}
