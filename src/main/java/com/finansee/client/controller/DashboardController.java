package com.finansee.client.controller;

import com.finansee.client.controller.components.ArticleCardController;
import com.finansee.client.model.Article;
import com.finansee.client.service.MockDataService;
import com.finansee.client.utils.SceneNavigator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import java.io.IOException;

public class DashboardController {

    @FXML private VBox articleContainer;
    private MockDataService dataService = new MockDataService();

    @FXML
    public void initialize() {
        loadArticles();
    }

    @FXML
    private void onPinkCardClicked() {
        SceneNavigator.loadView("/client/view/QuickAnalysis.fxml");
    }

    private void loadArticles() {
        articleContainer.getChildren().clear();
        for (Article art : dataService.getArticles()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/client/view/components/ArticleCard.fxml"));
                Node node = loader.load();

                ArticleCardController controller = loader.getController();
                controller.setData(art);

                articleContainer.getChildren().add(node);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}