package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;

@Entity
public class Learner extends User{
    private String university;
    private Double psp;
}
