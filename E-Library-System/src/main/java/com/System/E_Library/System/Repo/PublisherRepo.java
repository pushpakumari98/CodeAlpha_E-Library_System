package com.System.E_Library.System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.System.E_Library.System.Entity.Publisher;
import org.springframework.stereotype.Repository;
@Repository
public interface PublisherRepo extends JpaRepository<Publisher,Integer>{
}
