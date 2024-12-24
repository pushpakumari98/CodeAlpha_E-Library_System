package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookUpdateDto {
    private int bookId;

    private String bookTitle;

    
    private int authorId;

    
    private int publisherId;

    public Integer getPublisherId;
}
