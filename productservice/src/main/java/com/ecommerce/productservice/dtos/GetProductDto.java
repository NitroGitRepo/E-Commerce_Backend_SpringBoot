package com.ecommerce.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetProductDto {

    //whenever transfering data to outside create dto class
    private long id;

    private String name;

    private Double price;

    private String imageURL;
}
