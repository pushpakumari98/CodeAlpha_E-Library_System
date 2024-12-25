package com.System.E_Library.System.ServiceImpl;

import com.System.E_Library.System.Dto.AuthorDto;
import com.System.E_Library.System.Dto.AuthorSaveDto;
import com.System.E_Library.System.Dto.AuthorUpdateDto;
import com.System.E_Library.System.Entity.Author;
import com.System.E_Library.System.Repo.AuthorRepo;
import com.System.E_Library.System.Service.AuthorService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl  implements AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public String addAuthor(AuthorSaveDto authorSaveDto) {

        Author author=new Author(
        authorSaveDto.getAuthorName());
        authorRepo.save(author);
        return author.getAuthorName();
    }

    @Override
    public List<AuthorDto> getAllAuthor() {
        List<Author> getAuthors = authorRepo.findAll();
        List<AuthorDto> authorDtoList = new ArrayList<>();

        for (Author author : getAuthors) {
            // Use the corrected constructor
            AuthorDto authorDto = new AuthorDto(
                    author.getAuthorId(),
                    author.getAuthorName()
            );
            authorDtoList.add(authorDto);
        }
        return authorDtoList;
    }


    @SuppressWarnings("deprecation")
    @Override
    public String updateAuthor(AuthorUpdateDto authorUpdateDto) {

        if(authorRepo.existsById(authorUpdateDto.getAuthorId())){
       Author author=authorRepo.getById(authorUpdateDto.getAuthorId());
       author.setAuthorName(authorUpdateDto.getAuthorName());
       authorRepo.save(author);
       return author.getAuthorName();
        }
        else{
            System.out.println("Auhtor Id Not Exist!!!");
        }
                return null;
    }

    @Override
    public String deleteAuthor(int id) {
       if(authorRepo.existsById(id)){
          authorRepo.deleteById(id);
       }else{
        System.out.println("Id Not Found!!");
       } 
    
       return null;
    }
}
