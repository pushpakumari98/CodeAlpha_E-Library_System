package com.System.E_Library.System.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReturnController {
   

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
