package com.System.E_Library.System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.System.E_Library.System.Entity.Borrow;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepo extends JpaRepository<Borrow,Integer > {
}

