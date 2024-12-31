package com.System.E_Library.System.Dto;

import com.System.E_Library.System.Entity.Author;
import com.System.E_Library.System.Entity.Publisher;




public class BookDto {
   
    private int bookId;

    
    private String bookTitle;

    
    private String author;

    
    private Publisher publisher;


    public BookDto(int bookId, String bookTitle, String author, Publisher publisher) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public BookDto(int bookId, String bookTitle) {
    }

    public BookDto(int bookId, String bookTitle, String author, Object publisher) {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BookDto() {
    }
}
