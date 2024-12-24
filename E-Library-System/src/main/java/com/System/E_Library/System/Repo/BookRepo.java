package com.System.E_Library.System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.System.E_Library.System.Entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
    
}
