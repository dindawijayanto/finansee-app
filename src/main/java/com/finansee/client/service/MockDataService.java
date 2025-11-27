package com.finansee.client.service;

import com.finansee.client.model.Article;
import java.util.ArrayList;
import java.util.List;

public class MockDataService {

    // INTEGRASI DI SINI: Nanti diganti dengan panggilan ke API Spring Boot
    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();
        list.add(new Article("1", "Emiten Kripto Jeblok", "CNBC Indonesia", "20 Oct 2025", "10:45",
                "Investor ritel saham-saham emiten pemilik Bitcoin dilaporkan telah kehilangan sekitar US$17 miliar..."));
        list.add(new Article("2", "Tips Mengatur Keuangan", "Finance Daily", "21 Oct 2025", "08:00",
                "Mengatur keuangan di masa inflasi membutuhkan strategi khusus..."));
        return list;
    }
}