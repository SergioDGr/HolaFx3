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
	
	TextField txtSaludo = new TextField();
	Text txtRespNormal = new Text();
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
    	//
    	Text txtMensaje = new Text("Introduzca saludo:");
    	
    	Button btnSaludo = new Button("Hola");
    	btnSaludo.setOnAction(e -> saludar());
    	//
    	VBox box = new VBox();
    	box.getChildren().add(txtMensaje);
    	box.getChildren().add(txtSaludo);
    	box.getChildren().add(btnSaludo);
    	box.getChildren().add(txtRespNormal);
    	//
    	Scene scene = new Scene(box, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Ventana");
        stage.show();
    }
    
    private void saludar() {
    	//
    	if (txtSaludo.getText().equalsIgnoreCase("Obi wan")) {
    		Stage newStage = new Stage();
	    	newStage.setTitle("Modal");
	    	Text txtRespSaludo = new Text();
    		txtRespSaludo.setText("¡General Kenobi!");
    		VBox root = new VBox();
        	root.getChildren().add(txtRespSaludo);
        	Scene scene = new Scene(root, 100, 150);
        	newStage.setScene(scene);
        	newStage.showAndWait();
    	}else
    		txtRespNormal.setText("Hola " + txtSaludo.getText());
    	
    	
    }
    
}
