package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.GetAddressDto;
import com.ecommerce.productservice.dtos.GetProductDto;
import com.ecommerce.productservice.dtos.GetUserDto;
import com.ecommerce.productservice.exceptions.NotFoundException;
import com.ecommerce.productservice.models.Product;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class ProductService {


    //calling api will be done here
    //every business logic/ filtering logic will be written here/ every if condition written here
    public GetProductDto getProductById(Long id) throws NotFoundException{
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://fakestoreapi.com/products/" + id;
        Product product  = restTemplate.getForObject(url, Product.class);

        System.out.println(product);

        if(product == null){
            throw new NotFoundException();
        }

//        GetProductDto obj = new GetProductDto();
//        obj.setId(id);
//        obj.setName(product.getTitle());
//        obj.setPrice(product.getPrice());
//        obj.setImageURL(product.getImage());
//        return obj;

        return convertToDto(product);
    }


    public GetProductDto convertToDto(Product product){
        GetProductDto obj = new GetProductDto();
        obj.setId(product.getId());
        obj.setName(product.getTitle());
        obj.setPrice(product.getPrice());
        obj.setImageURL(product.getImage());
        return obj;
    }

    public List<GetProductDto> getAllProducts(){
        //1.Make a api call
        //2. Deserialize into java object -> Array of products
        //3. Convert the array into array list
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://fakestoreapi.com/products/";
        Product[] products = restTemplate.getForObject(url, Product[].class);
        System.out.println(products);

        List<GetProductDto> returnedProducts = new ArrayList<>();

        for(Product product: products){
            returnedProducts.add(convertToDto(product));
        }
        return  returnedProducts;
    }

    public GetUserDto getUserById(Long id){
        GetUserDto gt = new GetUserDto();
        gt.setUserId(id);
        gt.setUserName("Rajneesh Yadav");
        gt.setUserContact(9285144);
        return gt;
    }

    public GetAddressDto getUserAddress(int id){
        GetAddressDto gt = new GetAddressDto();
        gt.setAddressId(id);
        gt.setAddressLine("CIVIL LINE JABALPUR MADHYA PRADESH");
        gt.setCity("JABALPUR");
        return gt;
    }
}
