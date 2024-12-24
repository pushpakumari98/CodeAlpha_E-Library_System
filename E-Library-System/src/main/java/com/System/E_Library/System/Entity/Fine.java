package com.System.E_Library.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
    private String description;
    
    @SuppressWarnings("unused")
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "borrowId")
    private Borrow borrow;

    // Getters and setters
}
