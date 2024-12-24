package com.System.E_Library.System.Entity;

import java.util.Optional;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="bookId",length=11)
    private int bookId;

    @Column(name="bookTitle",length=11)
    private String bookTitle;


    @ManyToOne
    @JoinColumn(name="authorId")
    private Author author;

    @ManyToOne
    @JoinColumn(name="publisherId")
    private Publisher publisher;

    public Book(int bookId, String bookTitle, Author author, Publisher publisher) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(String bookTitle, Author author, Publisher publisher) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public Book() {
    }

  

    public Book(String bookTitle2, Optional<Author> byId, Optional<Publisher> byId2) {
        
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", publisher=" + publisher
                + "]";
    }
}
