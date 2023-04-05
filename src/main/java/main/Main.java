package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../views/addition-view.fxml"));
		
		BorderPane view = loader.load();
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();

	}
	public static void main (String[] args)
	{
		launch(args);
		
	}

}
