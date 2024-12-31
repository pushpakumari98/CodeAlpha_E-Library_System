package com.System.E_Library.System.ServiceImpl;

import com.System.E_Library.System.Entity.MyBookList;
import com.System.E_Library.System.Repo.MyBookListRepository;
import com.System.E_Library.System.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListServiceImpl implements MyBookListService {

    @Autowired
    private MyBookListRepository myBookListRepository;

    @Override
    public void saveMyBooks(MyBookList book) {
        book.setReturned(false);
        myBookListRepository.save(book);
    }

    @Override
    public List<MyBookList> getAllMyBooks() {
        return myBookListRepository.findAll();
    }

    @Override
    public void returnMyBook(int id) {
       MyBookList mybook = myBookListRepository.findById(id).get();
       mybook.setReturned(true);
       myBookListRepository.save(mybook);
    }
}
