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

import com.System.E_Library.System.Dto.BookDto;
import com.System.E_Library.System.Dto.BookSaveDto;
import com.System.E_Library.System.Dto.BookUpdateDto;
import com.System.E_Library.System.Service.BookService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {
     @Autowired
     private BookService bookService;


    @PostMapping(path="/save")
    public String saveBook(@RequestBody BookSaveDto bookSaveDto){
        String bookTitle=bookService.addBook(bookSaveDto);
        return "Added Successfully";
    }

    @GetMapping(path="/getAllBook")
    public List<BookDto> getAllBook()
    {
        List<BookDto> allBooks=bookService.getAllBook();
        return allBooks;
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody BookUpdateDto bookUpdateDto){
       String bookTitle=bookService.updateBook(bookUpdateDto);
       return bookTitle;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable(value="id")int id){
        String bookTitle=bookService.deleteBook(id);
        return "deleteId";
    }

   
}

    
