package com.System.E_Library.System.Dto;



public class AuthorDto {

    //Dto->Controller->Service->ServiceImpl->Repo->Entity
    
    private int authorId;
    private String authorName;
    // No-argument constructor (required for frameworks like Hibernate)
    public AuthorDto() {}

    // Constructor with parameters
    public AuthorDto(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    // Getters and Setters
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}