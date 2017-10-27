package com.example.Batch2.model.employee.book;

import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer book_id;

    private String isbn, book_title, author, publisher, location;
    private float price_after, price_before, discount;
    public Book(){}
    public Book(String isbn, String book_title, String author, String publisher, String location, float price_after, float price_before, float discount) {
        this.isbn = isbn;
        this.book_title = book_title;
        this.author = author;
        this.publisher = publisher;
        this.location = location;
        this.price_after = price_after;
        this.price_before = price_before;
        this.discount = discount;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getPrice_after() {
        return price_after;
    }

    public void setPrice_after(float price_after) {
        this.price_after = price_after;
    }

    public float getPrice_before() {
        return price_before;
    }

    public void setPrice_before(float price_before) {
        this.price_before = price_before;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
