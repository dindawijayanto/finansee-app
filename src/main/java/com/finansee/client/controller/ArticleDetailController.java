package com.finansee.client.controller;

import com.finansee.client.model.Article;
import com.finansee.client.utils.SceneNavigator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ArticleDetailController {

    @FXML private Label titleLabel;
    @FXML private Label authorLabel;
    @FXML private Label dateLabel;
    @FXML private Label timeLabel;
    @FXML private Label contentLabel;
    @FXML private ImageView articleImage;
    @FXML private Label headerTitle;

    private Article article;
    public void setArticle(Article article) {
        this.article = article;

        titleLabel.setText(article.getTitle());
        authorLabel.setText(article.getAuthor());
        dateLabel.setText(article.getDate());
        timeLabel.setText(article.getTime());
        contentLabel.setText(article.getContent());

        // TODO: Set Image dari URL/Path (Placeholder logic)
        // articleImage.setImage(new Image(article.getImageUrl()));
    }

    @FXML
    private void onBackClicked() {
        SceneNavigator.loadView("/client/view/Dashboard.fxml");
    }
}