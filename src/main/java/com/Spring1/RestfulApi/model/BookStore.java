package com.Spring1.calender.model;
//model class for Bookstore
public class BookStore {

    private String Title;
    private String Author;
    private String Genre;
    private String Price;
//no argument constructor
    public BookStore() {
    }
// argument constructor
    public BookStore(String title, String author, String genre, String price) {
        this.Title = title;
        this.Author = author;
        this.Genre = genre;
        this.Price = price;
    }
//getters and setters
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
