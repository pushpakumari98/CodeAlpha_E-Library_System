
package com.System.E_Library.System.Service;

import java.util.List;

import com.System.E_Library.System.Dto.BookDto;
import com.System.E_Library.System.Dto.BookSaveDto;
import com.System.E_Library.System.Dto.BookUpdateDto;
import com.System.E_Library.System.Entity.Book;
import org.springframework.stereotype.Service;


@Service

public interface BookService {

	public void save(Book b);

	String addBook(BookSaveDto bookSaveDto);

	public List<BookDto> getAllBook();

	public Book getBookById(int id);

	public void deleteById(int id);

	String updateBook(BookUpdateDto bookUpdateDto);

	String deleteBook(int id);

}