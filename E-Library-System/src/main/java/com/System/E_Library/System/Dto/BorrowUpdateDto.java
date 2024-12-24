package com.System.E_Library.System.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BorrowUpdateDto {

    private int bookId;
    private String bookTitle;
    private int authorId;
    private  int publisherId;

    public LocalDate getBorrowDate() {
      return getBorrowDate();
    }
    public LocalDate getReturnDate() {
       return getReturnDate();
    }
    public Integer getUserId() {
       return getUserId();
    }
    public Integer getId() {
       return getId();
    }
    
}

