package com.ecommerce.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetAddressDto {
    private int addressId;

    private String addressLine;

    private String city;
}
