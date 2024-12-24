package com.System.E_Library.System.Service;

import java.util.List;

import com.System.E_Library.System.Dto.BookDto;
import com.System.E_Library.System.Dto.BookSaveDto;
import com.System.E_Library.System.Dto.BookUpdateDto;
import com.System.E_Library.System.Entity.Book;

public interface BookService {

    String addBook(BookSaveDto bookSaveDto);

    List<BookDto> getAllBook();

    String updateBook(BookUpdateDto bookUpdateDto);

    String deleteBook(int id);

    List<Book> getAllBooks();
    
}
