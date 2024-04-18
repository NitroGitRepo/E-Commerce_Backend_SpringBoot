package com.ecommerce.productservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NotFoundException extends Exception{

    //constructor

    public NotFoundException(){
        super("The Product ID was not found");
    }
}
