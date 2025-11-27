package com.finansee.client.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import java.io.IOException;

public class SceneNavigator {
    private static StackPane mainContentHolder;

    public static void setMainContentHolder(StackPane holder) {
        mainContentHolder = holder;
    }

    public static void loadView(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneNavigator.class.getResource(fxmlPath));
            Node node = loader.load();
            mainContentHolder.getChildren().setAll(node);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}