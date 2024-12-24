package com.System.E_Library.System.Entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="authorId",length=11)
    private int authorId;

    @Column(name="authorName",length=45)
    private String authorName;

    @OneToMany(mappedBy="author")
    private Set<Book> books;

    
    public Author(int authorId,String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public Author(String authorName) {
       this.authorName=authorName;
    }
    
    public Author(){

    }
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

    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", authorName=" + authorName + ", getAuthorId()=" + getAuthorId() + ", getAuthorName()="
                + getAuthorName() + ", toString()=" + super.toString() + "]";
    }

    
}
