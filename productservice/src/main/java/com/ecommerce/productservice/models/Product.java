package com.ecommerce.productservice.models;



import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@Builder
public class Product {
    //model is used for internal use only - database mapping
    private long id;

    private String title;

    private  String description;

    private Double price;

    private String image;

    private String category;

    private String seller;

}
