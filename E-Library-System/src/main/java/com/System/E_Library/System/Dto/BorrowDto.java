package com.System.E_Library.System.Dto;

import java.sql.Date;

public class BorrowDto {
    private int bookId;
    private String bookTitle;
    private String authorName;
    private String publisherName;
    private String borrowerName;
    private Date borrowDate;
    private Date returnDate;
    private int fine;

    // No-argument constructor
    public BorrowDto() {}

    // Constructor with arguments
    public BorrowDto(int bookId, String bookTitle, String authorName, String publisherName,
                     String borrowerName, Date borrowDate, Date returnDate, int fine) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    // Getters and Setters
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
