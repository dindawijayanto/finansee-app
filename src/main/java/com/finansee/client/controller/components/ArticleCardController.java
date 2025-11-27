package com.finansee.client.controller.components;

import com.finansee.client.controller.ArticleDetailController;
import com.finansee.client.model.Article;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class ArticleCardController {

    @FXML private Label titleLabel;
    @FXML private Label dateLabel;
    @FXML private Label timeLabel;

    private Article article;

    public void setData(Article article) {
        this.article = article;
        titleLabel.setText(article.getTitle());
        dateLabel.setText(article.getDate());
        timeLabel.setText(article.getTime());
    }

    @FXML
    private void onClick(MouseEvent event) {
        try {
            // PERBAIKAN PATH: Menambahkan /client/view/
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/client/view/ArticleDetail.fxml"));
            Parent view = loader.load();

            ArticleDetailController detailController = loader.getController();
            detailController.setArticle(article);

            // Mencari StackPane utama (contentArea) dan mengganti isinya
            StackPane contentArea = (StackPane) titleLabel.getScene().lookup("#contentArea");
            if (contentArea != null) {
                contentArea.getChildren().setAll(view);
            } else {
                System.err.println("CRITICAL ERROR: Could not find #contentArea to navigate!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}