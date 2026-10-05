package com.example.demo2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.IOException;

public class HelloApplication {
    public static void main(String[] args) {
        Application.launch(BmiApplication.class, args);
    }

    public static class BmiApplication extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(BmiApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 420, 340);
            stage.setTitle("Prevod hmotnosti");
            stage.setScene(scene);
            stage.show();
        }
    }
}
