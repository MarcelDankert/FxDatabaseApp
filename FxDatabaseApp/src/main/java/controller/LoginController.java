/**
 * 
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author s15
 *
 */
public class LoginController {
	@FXML
	private Button closeBtn, resetBtn, loginBtn;
	@FXML
	private TextField benutzerTf, passwortTf;

	@FXML
	public void closeWindow(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	public void reset(ActionEvent event) {
		System.out.println("User: " + benutzerTf.getText());
		System.out.println("Passwort: " + passwortTf.getText());
	}

	@FXML
	public void login(ActionEvent event) throws Exception {
		System.out.println("Login gedrückt");
		Parent root = FXMLLoader.load(getClass().getResource("../FXML_Files/MainView.fxml"));
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
		scene.getStylesheets().add(getClass().getResource("../css/application.css").toExternalForm());
        
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
	}

}
