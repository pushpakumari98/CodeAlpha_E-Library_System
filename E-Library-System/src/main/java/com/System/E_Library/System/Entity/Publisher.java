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
@Table(name="publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="publisherId",length =11)
    private int publisherId;

    @Column(name="publisherName",length=45)
    private String publisherName;

   
    @OneToMany(mappedBy ="publisher")
    private Set<Book> books;
    
    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }


    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public Publisher() {
        
    }
   

    public int getPublisherId() {
        return publisherId;
    }

    @Override
    public String toString() {
        return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", getPublisherId()="
                + getPublisherId() + ", getPublisherName()=" + getPublisherName() + "]";
    }


    public String getPublisherName() {
       return publisherName;
    }


    public void setPublisherName(String publisherName) {
       this.publisherName=publisherName;
    }
    

    
}
