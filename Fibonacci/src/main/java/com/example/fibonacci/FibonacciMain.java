package com.example.fibonacci;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FibonacciMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FibonacciMain.class.getResource("FibonacciApplication.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 430);
        stage.setTitle("Fibonacci Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}