package com.finansee.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/client/view/MainLayout.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 400, 800);

        scene.getStylesheets().add(getClass().getResource("/client/view/css/style.css").toExternalForm());

        primaryStage.setTitle("Finance App");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}