package com.finansee.model;

public class Article {
    // Model sederhana untuk demo UI, data artikel nanti di-set langsung di Controller
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}