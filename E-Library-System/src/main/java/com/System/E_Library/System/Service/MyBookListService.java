package com.System.E_Library.System.Service;



import com.System.E_Library.System.Entity.MyBookList;



import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface MyBookListService {
	

	public void saveMyBooks(MyBookList book);
	
	public List<MyBookList> getAllMyBooks();

	public void returnMyBook(int id);
}