package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BookUpdateDto {
    private int bookId;

    private String bookTitle;

    
    private int authorId;

    
    private int publisherId;

    public int getPublisherId() {
        return publisherId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getAuthorId() {
        return authorId;
    }
}
