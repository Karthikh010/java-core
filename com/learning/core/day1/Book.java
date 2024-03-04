package com.learning.com.day1;

class Book {
    private String book_title;
    private double book_price;

    public String getbook_title() {
        return book_title;
    }

    public void setbook_title(String book_title) {
        this.book_title = book_title;
    }

    public double getbook_price() {
        return book_price;
    }

    public void setbook_price(double book_price) {
        this.book_price = book_price;
    }
    
    public static void createBooks(String title, double price) {
        Book book = new Book();
        book.setbook_title(title);
        book.setbook_price(price);
    }

    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getbook_title()+" and Price: " + book.getbook_price());
    }
}