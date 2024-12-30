package com.System.E_Library.System.Repo;
import com.System.E_Library.System.Entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookListRepository extends JpaRepository<MyBookList,Integer> {

}