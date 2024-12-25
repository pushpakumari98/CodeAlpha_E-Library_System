package com.System.E_Library.System.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.System.E_Library.System.Repo.BookRepository;
import com.System.E_Library.System.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.System.E_Library.System.Dto.BookDto;
import com.System.E_Library.System.Dto.BookSaveDto;
import com.System.E_Library.System.Dto.BookUpdateDto;
import com.System.E_Library.System.Entity.Book;
import com.System.E_Library.System.Repo.AuthorRepo;

import com.System.E_Library.System.Repo.PublisherRepo;
import com.System.E_Library.System.Service.BookService;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private AuthorRepo authorRepo;


    @Autowired
    private PublisherRepo publisherRepo;


    @Autowired
    private MyBookListService myBookListService;
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Book b) {

    }

    @Override
    public String addBook(BookSaveDto bookSaveDto) {

       Book book=new Book(
          bookSaveDto.getBookTitle(),
          authorRepo.findById(bookSaveDto.getAuthorId()),
          publisherRepo.findById(bookSaveDto.getPublisherId())
       );
       bookRepository.save(book);
       return book.getBookTitle();
    }


    @Override
    public List<BookDto> getAllBook() {
       List<Book> getBooks=bookRepository.findAll();
        List<BookDto> bookDtoList=new ArrayList<>();

        for(Book book:getBooks){
            BookDto bookDto=new BookDto(
               book.getBookId(),
               book.getBookTitle(),
               book.getAuthor(),
               book.getPublisher()
            );
            bookDtoList.add(bookDto);

        }
        return  bookDtoList;
    }

    @Override
    public Book getBookById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public String updateBook(BookUpdateDto bookUpdateDto) {

        if(bookRepository.existsById(bookUpdateDto.getBookId()))
        {
            Book book= bookRepository.getById(bookUpdateDto.getBookId());
            book.setBookTitle(bookUpdateDto.getBookTitle());
            book.setAuthor(String.valueOf(authorRepo.getById((bookUpdateDto.getAuthorId()))));
            book.setPublisher(publisherRepo.getById(bookUpdateDto.getPublisherId()));
            bookRepository.save(book);
            return book.getBookTitle();
        }
        else{
            System.out.println("Book ID not found");
        }
        return null;
    }

    @Override
    public String deleteBook(int id) {
        if(bookRepository.existsById(id))
        {
          bookRepository.deleteById(id);
        }
        else{
            System.out.println(" Book Id Not Found");
        }
        return "Book deleted successfully";
    }


//    @Override
//    public List<BookDto> getAllBooks() {
//        List<Book> getBooks = bookRepository.findAll();
//        List<BookDto> bookDtoList = new ArrayList<>();
//
//        for (Book book : getBooks) {
//            // Use the corrected constructor
//            BookDto bookDto = new BookDto(
//                    book.getBookId(),
//                    book.getBookTitle()
//            );
//            bookDtoList.add(bookDto);
//        }
//        return bookDtoList;
//    }




}
