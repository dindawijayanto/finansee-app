package com.finansee.controller;

import com.finansee.model.Transaction;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class DashboardController {

    @FXML private VBox transactionContainer;
    @FXML private Label totalBalanceLabel;
    @FXML private Label totalExpenseLabel;
    @FXML private ProgressBar expenseProgress;

    @FXML
    public void initialize() {
        totalBalanceLabel.setText("Rp7.783,00");
        totalExpenseLabel.setText("-Rp1.187,40");
        expenseProgress.setProgress(0.3);

        transactionContainer.getChildren().clear();

        Transaction t1 = new Transaction("Salary", "18:27 - April 30", "Monthly", "Rp4.000,00", false);
        Transaction t2 = new Transaction("Groceries", "17:00 - April 24", "Pantry", "-Rp100,00", true);
        Transaction t3 = new Transaction("Rent", "08:30 - April 15", "Rent", "-Rp674,40", true);

        transactionContainer.getChildren().addAll(
                createRow(t1),
                createRow(t2),
                createRow(t3)
        );
    }

    @FXML
    private void handleArticleCardClick(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/article.fxml"));
            Parent articleView = loader.load();

            Node source = (Node) event.getSource();
            BorderPane mainLayout = (BorderPane) source.getScene().lookup("#mainContainer");

            if (mainLayout != null) {
                mainLayout.setCenter(articleView);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private HBox createRow(Transaction t) {
        HBox row = new HBox(15);
        row.getStyleClass().add("transaction-row");
        row.setAlignment(javafx.geometry.Pos.CENTER_LEFT);

        HBox iconBox = new HBox();
        iconBox.getStyleClass().add("trans-icon-bg");
        Label icon = new Label(t.getTitle().substring(0, 1));
        iconBox.getChildren().add(icon);

        VBox info = new VBox(3);
        Label title = new Label(t.getTitle());
        title.getStyleClass().add("trans-title");
        Label meta = new Label(t.getDate());
        meta.getStyleClass().add("trans-meta");
        info.getChildren().addAll(title, meta);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        VBox priceBox = new VBox(3);
        priceBox.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);

        Label amount = new Label(t.getAmount());
        amount.getStyleClass().add(t.isExpense() ? "amount-neg" : "amount-pos");
        Label cat = new Label(t.getCategory());
        cat.getStyleClass().add("trans-meta");

        priceBox.getChildren().addAll(amount, cat);
        row.getChildren().addAll(iconBox, info, spacer, priceBox);
        return row;
    }
}