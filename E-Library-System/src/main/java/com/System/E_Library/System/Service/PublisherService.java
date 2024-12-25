package com.System.E_Library.System.Service;

import java.util.List;

import com.System.E_Library.System.Dto.PublisherDto;
import com.System.E_Library.System.Dto.PublisherSaveDto;
import com.System.E_Library.System.Dto.PublisherUpdateDto;
import org.springframework.stereotype.Service;

@Service
public interface PublisherService {

    String addPublisher(PublisherSaveDto publisherSaveDto);

    List<PublisherDto> getAllPublisher();

    String updatePublisher(PublisherUpdateDto publisherUpdateDto);

    String deletePublisher(int id);
    
}
