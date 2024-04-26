package com.ecommerce.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter

//Informing hibernate to create a table for this below class(entity) where name of your table will be User'
//@MappedSuperclass  //it table should not be created in database
@Entity(name = "ecom_user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email", unique = true)
    private String email;
}
