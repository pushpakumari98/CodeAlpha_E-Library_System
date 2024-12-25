package com.System.E_Library.System.Controller;

import com.System.E_Library.System.Dto.AuthorDto;
import com.System.E_Library.System.Dto.AuthorSaveDto;
import com.System.E_Library.System.Dto.AuthorUpdateDto;
import com.System.E_Library.System.Service.AuthorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@CrossOrigin
@RequestMapping("api/v1/author")

public class AuthorController {
    
    @Autowired
    private AuthorService authorService;


    @GetMapping(path="/getAllAuthor")
    public List<AuthorDto> getAllAuthor()
    {
        List <AuthorDto> allAuthors=authorService.getAllAuthor();
        return allAuthors;
    }

    @PostMapping(path="/save")
    public String saveAuthor(@RequestBody AuthorSaveDto authorSaveDto){
        String authorName=authorService.addAuthor(authorSaveDto);
        return "Added Successfully";
    }

    @PutMapping("/update")
    public String updateAuthor(@RequestBody AuthorUpdateDto authorUpdateDto){
       String authorName=authorService.updateAuthor(authorUpdateDto);
       return authorName;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable(value="id")int id){
        String authorName=authorService.deleteAuthor(id);
        return "deleteId";
    }
}
