package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/usuario.fxml"));
			primaryStage.setTitle("AVIONES-LOGIN");
			primaryStage.setResizable(false);
			primaryStage.setScene(new Scene(root,400,220));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) {
		try {
			Parent padre = FXMLLoader.load(getClass().getResource(fxml));
			if (stg != null) {
				stg.getScene().setRoot(padre);
				stg.setHeight(600);
				stg.setWidth(900);
				stg.setResizable(true);
				stg.setTitle("AVIONES-AEROPUERTOS");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
