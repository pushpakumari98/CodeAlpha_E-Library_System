package com.System.E_Library.System.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.System.E_Library.System.Dto.PublisherDto;
import com.System.E_Library.System.Dto.PublisherSaveDto;
import com.System.E_Library.System.Dto.PublisherUpdateDto;
import com.System.E_Library.System.Entity.Publisher;
import com.System.E_Library.System.Repo.PublisherRepo;
import com.System.E_Library.System.Service.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepo publisherRepo;

    @Override
    public String addPublisher(PublisherSaveDto publisherSaveDto) {
        Publisher publisher = new Publisher(publisherSaveDto.getPublisherName());
        publisherRepo.save(publisher);
        return publisher.getPublisherName();
    }

    @Override
    public List<PublisherDto> getAllPublisher(){
        List<Publisher> getPublishers=publisherRepo.findAll();
        List<PublisherDto> publisherDtoList=new ArrayList<>();

        for(Publisher publisher:getPublishers){
            PublisherDto publisherDto=new PublisherDto(
            publisher.getPublisherId(),
            publisher.getPublisherName()
            );
            publisherDtoList.add(publisherDto);

        }
        return  publisherDtoList;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String updatePublisher(PublisherUpdateDto publisherUpdateDto) {
       if(publisherRepo.existsById(publisherUpdateDto.getPublisherId())){
       Publisher publisher=(Publisher) publisherRepo.getById(publisherUpdateDto.getPublisherId());
       publisher.setPublisherName(publisherUpdateDto.getPublisherName());
       publisherRepo.save(publisher);
       return publisher.getPublisherName();
        }
        else{
            System.out.println("Publisher Id Not Exist!!!");
        }
                return null;
    }

    @Override
    public String deletePublisher(int id) {
        if (publisherRepo.existsById(id)) {
            publisherRepo.deleteById(id);
            return "Publisher deleted successfully!";
        } else {
            System.out.println("ID not found!");
            return "ID not found!";
        }
    }
}
