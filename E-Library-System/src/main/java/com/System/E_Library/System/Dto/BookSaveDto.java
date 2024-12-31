package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BookSaveDto {
    private String bookTitle;

    
    private int authorId;

    
    private int publisherId;

    public String getBookTitle() {
        return bookTitle;
    }

    public int getAuthorId() {
        return authorId;
    }

    public int getPublisherId() {
        return publisherId;
    }
}
