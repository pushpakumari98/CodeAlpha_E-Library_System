package com.System.E_Library.System.Dto;

import java.sql.Date;
import java.time.LocalDate;

import com.System.E_Library.System.Entity.Book;
import com.System.E_Library.System.Entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BorrowDto {

    private int bookId;
    private String bookTitle;
    private String authorName;
    private String publisherName;
    private String borrowerName ;
    private Date borrowDate;
    private Date returnDate;
    private int Fine;

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getFine() {
        return Fine;
    }

     public BorrowDto(int bookId, String bookTitle, String authorName, String publisherName, String borrowerName, Date borrowDate, Date returnDate, int fine) {
         this.bookId = bookId;
         this.bookTitle = bookTitle;
         this.authorName = authorName;
         this.publisherName = publisherName;
         this.borrowerName = borrowerName;
         this.borrowDate = borrowDate;
         this.returnDate = returnDate;
         Fine = fine;
     }
}