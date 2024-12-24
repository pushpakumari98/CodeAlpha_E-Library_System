package com.System.E_Library.System.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.System.E_Library.System.Dto.PublisherDto;
import com.System.E_Library.System.Dto.PublisherSaveDto;
import com.System.E_Library.System.Dto.PublisherUpdateDto;
import com.System.E_Library.System.Service.PublisherService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/publisher")
public class PublisherController {
    @Autowired
    private PublisherService publisherService;


    @PostMapping(path="/save")
    public String savePublisher(@RequestBody PublisherSaveDto publisherSaveDto){
        String publisherName=publisherService.addPublisher(publisherSaveDto);
        return "Added Successfully";
    }
    @GetMapping(path="/getAllPublisher")
    public List<PublisherDto> getAllPublisher()
    {
        List <PublisherDto> allPublishers=publisherService.getAllPublisher();
        return allPublishers;
    }

     @PutMapping("/update")
    public String updatePublisher(@RequestBody PublisherUpdateDto publisherUpdateDto){
       String publisherName=publisherService.updatePublisher(publisherUpdateDto);
       return publisherName;
    }
    @DeleteMapping("/delete/{id}")
    public String deletePublisher(@PathVariable(value="id")int id){
        String publisherName=publisherService.deletePublisher(id);
        return "deleteId";
    }
}
