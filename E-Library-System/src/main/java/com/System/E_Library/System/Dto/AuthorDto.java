package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class AuthorDto {

    //Dto->Controller->Service->ServiceImpl->Repo->Entity
    
    private int authorId;
    private String authorName;


}