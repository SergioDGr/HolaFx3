package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
    	//
    	Text mensaje = new Text("Introduzca saludo:");
    	TextField inputFrase = new TextField();
    	Button btnSaludo = new Button("Hola");
    	btnSaludo.setOnAction(e -> saludar());
    	//
    	VBox box = new VBox();
    	box.getChildren().add(mensaje);
    	box.getChildren().add(inputFrase);
    	box.getChildren().add(btnSaludo);
    	//
    	Scene scene = new Scene(box, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Ventana");
        stage.show();
    }
    
    private void saludar() {
    	
    }
    
}
