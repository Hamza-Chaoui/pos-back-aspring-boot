package com.pos.backposapp.model;

import jakarta.persistence.*;
import lombok.Getter;

// Product.java
@Getter
@Entity
@Table(name = "PRODUCT")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    // Default constructor
    public Product() {
    }

    // Constructor with fields
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // getters and setters
}

