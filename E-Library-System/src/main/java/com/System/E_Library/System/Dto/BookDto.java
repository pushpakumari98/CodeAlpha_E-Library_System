package com.System.E_Library.System.Dto;

import com.System.E_Library.System.Entity.Author;
import com.System.E_Library.System.Entity.Publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDto {
   
    private int bookId;

    
    private String bookTitle;

    
    private Author author;

    
    private Publisher publisher;

  
}
