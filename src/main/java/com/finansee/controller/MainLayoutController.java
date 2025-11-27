package com.finansee.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.Parent;
import java.io.IOException;

public class MainLayoutController {

    @FXML
    private BorderPane mainContainer;

    @FXML
    public void initialize() {
        handleHomeClick();
    }

    @FXML
    private void handleHomeClick() {
        loadView("/fxml/dashboard.fxml");
    }

    @FXML
    private void handleArticleClick() {
        loadView("/fxml/article.fxml");
    }

    private void loadView(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent view = loader.load();
            mainContainer.setCenter(view);
        } catch (IOException e) {
            System.err.println("Gagal memuat FXML: " + fxmlPath);
            e.printStackTrace();
        }
    }
}