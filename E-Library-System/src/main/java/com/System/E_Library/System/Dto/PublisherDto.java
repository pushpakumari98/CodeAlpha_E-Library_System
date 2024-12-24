package com.System.E_Library.System.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PublisherDto {
    private int publisherId;
    private String publisherName;

    public int getPublisherId() {
        return publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

 
}
