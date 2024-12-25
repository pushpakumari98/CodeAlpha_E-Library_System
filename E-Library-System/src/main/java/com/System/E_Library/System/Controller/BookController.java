package com.System.E_Library.System.Controller;
import com.System.E_Library.System.Dto.BookDto;
import com.System.E_Library.System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.System.E_Library.System.Entity.Book;
import com.System.E_Library.System.Entity.MyBookList;
import com.System.E_Library.System.Service.MyBookListService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookListService myBookListService;

    @GetMapping("/return")
    public String returnPage() {
        return "return"; // Renders return.html
    }

    @PostMapping("/return")
    public String returnBook(@RequestParam("bookId") String bookId) {
        System.out.println("Returning book with ID: " + bookId);
        // Logic for returning the book can be added here
        return "redirect:/"; // Redirects back to homepage
    }

    @GetMapping("/borrow")
    public String borrowPage() {
        return "borrow"; // Renders borrow.html
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam("bookId") String bookId) {
        System.out.println("Borrowing book with ID: " + bookId);
        // Logic for borrowing the book can be added here
        return "redirect:/"; // Redirects back to homepage
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        List<BookDto> list = bookService.getAllBook();
        System.out.println("Books fetched: " + list);
        return new ModelAndView("bookList", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String getMyBooks(Model model) {
        List<MyBookList> list = myBookListService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book book = bookService.getBookById(id);
        MyBookList myBook = new MyBookList(book.getId(), book.getName(), book.getAuthor(), book.getPrice());
        myBookListService.saveMyBooks(myBook);
        return "redirect:/my_books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "bookEdit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        bookService.deleteById(id);
        return "redirect:/available_books";
    }
}
