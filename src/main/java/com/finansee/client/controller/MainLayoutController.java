package com.finansee.client.controller;

import com.finansee.client.utils.SceneNavigator;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class MainLayoutController {

    @FXML private StackPane contentArea;

    @FXML
    public void initialize() {
        SceneNavigator.setMainContentHolder(contentArea);
        loadDashboard();
    }

    @FXML private void loadDashboard() {
        SceneNavigator.loadView("/client/view/Dashboard.fxml");
    }

    @FXML private void loadAnalysis() { System.out.println("Nav to Analysis"); }
    @FXML private void loadAdd() { System.out.println("Nav to Add Expenses, Income, and Savings Goals"); }
    @FXML private void loadWallet() { System.out.println("Nav to Transaction"); }
    @FXML private void loadProfile() { System.out.println("Nav to Profile"); }
}