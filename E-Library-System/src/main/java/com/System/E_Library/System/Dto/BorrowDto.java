package com.System.E_Library.System.Dto;

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

    private int id;
    private Book book;
    private User user;
    private LocalDate borrowDate;
    private LocalDate returnDate;


}