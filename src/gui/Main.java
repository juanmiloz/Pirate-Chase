package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.PirateChase;

public class Main extends Application{
	
	private PirateChase pirateChase;
	private PirateChaseGUI pirateChaseGUI;
	
	public Main() {
		pirateChase	= new PirateChase();
		pirateChaseGUI = new PirateChaseGUI(pirateChase);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(/*Nombre*/""));
		fxmlLoader.setController(pirateChaseGUI);
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		pirateChaseGUI.showMainScreen();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pirate Chase");
		
		primaryStage.show();
	}

}
