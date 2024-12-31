package com.System.E_Library.System.Controller;

import com.System.E_Library.System.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService myBookListService;
	
	@RequestMapping("/returnmybook/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		myBookListService.returnMyBook(id);
		return "redirect:/my_books";
	}
}