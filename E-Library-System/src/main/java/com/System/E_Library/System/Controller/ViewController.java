package com.System.E_Library.System.Controller;

import com.System.E_Library.System.Entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {



    @GetMapping("/return")
    public String returnPage() {
        return "return"; // Renders return.html
    }

    @PostMapping("/return")
    public String returnBook(@RequestParam("bookId") String bookId) {
        System.out.println("Returning book with ID: " + bookId);
        return "redirect:/"; // Redirects back to homepage
    }

    @GetMapping("/borrow")
    public String borrowPage() {
        return "borrow"; // Renders return.html
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam("bookId") String bookId) {
        System.out.println("Borrowing book with ID: " + bookId);
        return "redirect:/"; // Redirects back to homepage
    }


}