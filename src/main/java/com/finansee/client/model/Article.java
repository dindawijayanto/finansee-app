package com.finansee.client.model;

public class Article {
    private String id;
    private String title;
    private String author;
    private String date;
    private String time;
    private String content;
    private String imageUrl;

    public Article(String id, String title, String author, String date, String time, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.time = time;
        this.content = content;
        // Placeholder image logic di sini
        this.imageUrl = "/images/article_placeholder.png";
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }
}