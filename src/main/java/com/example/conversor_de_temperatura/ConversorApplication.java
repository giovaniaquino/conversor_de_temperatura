package com.example.conversor_de_temperatura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ConversorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ConversorApplication.class.getResource("conversor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 529, 307);
        stage.setTitle("Conversor de Temperatura");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}