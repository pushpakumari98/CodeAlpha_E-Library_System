

package com.System.E_Library.System.Repo;


import com.System.E_Library.System.Entity.Book;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {



}