package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorUpdateDto {
    
    private int authorId;
    private String authorName;

    public int getAuthorId() {
        return authorId;
    }
    public String getAuthorName(){
        return getAuthorName();

    }
}
