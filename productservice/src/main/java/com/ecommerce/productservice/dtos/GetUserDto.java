package com.ecommerce.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetUserDto {

    private long userId;
    private String userName;
    private long userContact;
}
