package com.alberto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/Reservas.fxml"));
        stage.setTitle("Pantalla Principal");
        Scene scene = new Scene(root, 640, 500);
        scene.getStylesheets().add(getClass().getResource("/com/alberto/styles/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
