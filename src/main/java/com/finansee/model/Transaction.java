package com.finansee.model;

public class Transaction {
    private String title;
    private String date;
    private String category;
    private String amount;
    private boolean isExpense;

    public Transaction(String title, String date, String category, String amount, boolean isExpense) {
        this.title = title;
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.isExpense = isExpense;
    }

    public String getTitle() { return title; }
    public String getDate() { return date; }
    public String getCategory() { return category; }
    public String getAmount() { return amount; }
    public boolean isExpense() { return isExpense; }
}