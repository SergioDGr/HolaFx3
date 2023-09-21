package application;

import javafx.application.Application;
import javafx.application.Platform;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import javafx.stage.Stage;

public class Main extends Application {
	
	TextField tfSaludo;
	Text txtRespNormal;
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
    	//Componentes
    	Text txtMensaje = new Text("Introduzca usuario:");
    	tfSaludo = new TextField();
    	txtRespNormal = new Text();
    	Button btnSaludo = new Button("Hola");
    	Button btnCerrar = new Button("Cerrar");
    	//Eventos
    	btnSaludo.setOnAction(e -> click_saludar());
    	btnCerrar.setOnAction(e -> Platform.exit());
    	//Panel
    	VBox vbPanel = new VBox();
    	vbPanel.getChildren().add(txtMensaje);
    	vbPanel.getChildren().add(tfSaludo);
    	vbPanel.getChildren().add(btnSaludo);
    	vbPanel.getChildren().add(txtRespNormal);
    	vbPanel.getChildren().add(btnCerrar);
    	//Escena y su configuracion
    	Scene scene = new Scene(vbPanel, 400, 400);
        String estiloCss = getClass().getResource("style.css").toString();
        scene.getStylesheets().add(estiloCss);
    	stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Ventana");
        stage.show();
    }
    
    /**
     * Evento que al darle al boton dependiendo de lo que an puesto en tfsaludo
     * se mostrar un mensaje generico o modal con un mensaje personalisado
     */
    private void click_saludar() {
    	//Cuando es mensaje generico
    	if (!tfSaludo.getText().equalsIgnoreCase("Obi wan")) {
    		txtRespNormal.setText("Hola " + tfSaludo.getText());
    	}else {
    		//Se crea un modal
    		Stage newStage = new Stage();
	    	newStage.setTitle("Modal");
	    	//texto
	    	Text txtRespSaludo = new Text();
    		txtRespSaludo.setText("¡General Kenobi!");
    		//Panel principal
    		VBox root = new VBox();
        	root.getChildren().add(txtRespSaludo);
        	root.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
        	//Escena y añadir al escenario
        	Scene scene = new Scene(root, 150, 100,Color.BLUE);
        	newStage.setScene(scene);
        	newStage.showAndWait();
    	}
    		
    }
    
}
