package com.System.E_Library.System.Entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowId", length = 11) // Rename the primary key column
    private int borrowId;

    @Column(name = "bookTitle")
    private String bookTitle;

    @Column(name = "authorName")
    private String authorName;

    @Column(name = "publisherName")
    private String publisherName;

    @Column(name = "borrowerName")
    private String borrowerName;

    @Column(name = "borrowDate")
    private Date borrowDate;

    @Column(name = "returnDate")
    private Date returnDate;

    @Column(name = "fine")
    private int fine;

    @ManyToOne
    @JoinColumn(name = "bookId", insertable = false, updatable = false) // Prevent duplication
    private Book book;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "borrow")
    private Set<Fine> fines;

    // Getters and Setters

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Fine> getFines() {
        return fines;
    }

    public void setFines(Set<Fine> fines) {
        this.fines = fines;
    }

    // Constructors, toString, etc.

    public Borrow() {
    }


    public Borrow(int bookId, String bookTitle2, String authorName2, String publisherName2, String borrowerName2,
            Date borrowDate2, Date returnDate2, int fine2) {
                this.borrowId = borrowId;
                this.bookTitle = bookTitle;
                this.authorName = authorName;
                this.publisherName = publisherName;
                this.borrowerName = borrowerName;
                this.borrowDate = borrowDate;
                this.returnDate = returnDate;
                this.fine = fine;
                this.book = book;
                this.user = user;
                this.fines = fines;
    }

    @Override
    public String toString() {
        return "Borrow [borrowId=" + borrowId + ", bookTitle=" + bookTitle + ", authorName=" + authorName
                + ", publisherName=" + publisherName + ", borrowerName=" + borrowerName + ", borrowDate=" + borrowDate
                + ", returnDate=" + returnDate + ", fine=" + fine + ", book=" + book + ", user=" + user + ", fines="
                + fines + "]";
    }

    public int getBookId() {
       return getBookId();
    }

   
}
