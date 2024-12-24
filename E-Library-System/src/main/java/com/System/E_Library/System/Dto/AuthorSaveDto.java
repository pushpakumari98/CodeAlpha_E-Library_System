package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorSaveDto {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
