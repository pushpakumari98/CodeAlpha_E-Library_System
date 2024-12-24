package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookSaveDto {
    private String bookTitle;

    
    private int authorId;

    
    private int publisherId;
}
