package com.System.E_Library.System.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BorrowSaveDto {
    private int bookId;
    private String bookTitle;
    private int authorId;
    private  int publisherId;


    public Integer getBookId() {
       return getBookId();
    }

    public LocalDate getReturnDate() {
             return getReturnDate();  
    }

    public Integer getUserId() {
        return getUserId();
    }

    public LocalDate getBorrowDate() {
      return getBorrowDate();
    }
   
}
