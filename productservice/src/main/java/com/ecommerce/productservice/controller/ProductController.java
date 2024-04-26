package com.ecommerce.productservice.controller;
import com.ecommerce.productservice.dtos.GetAddressDto;
import com.ecommerce.productservice.dtos.GetProductDto;
import com.ecommerce.productservice.dtos.GetUserDto;
import com.ecommerce.productservice.models.Product;
import com.ecommerce.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//junit
@RestController
@RequestMapping("/product")
public class ProductController {

    //controller is the entry point for our application
           @GetMapping("/checking")
           public String checking(){
               return " Service running Fine";
           }

           private ProductService productService;

           public ProductController(ProductService productService) {
               this.productService = productService;
           }

           // http://localhost:8080/product/{id}
          @GetMapping("/{id}")
          public @ResponseBody GetProductDto getProductById (@PathVariable("id") long id) throws Exception{
               return productService.getProductById(id);
          }

          //http://localhost:8080/product
          @GetMapping("")
          public @ResponseBody List<GetProductDto> getAllProducts(){
               return productService.getAllProducts();
          }

          //http://localhost:8080/user/{{userId}}
          @GetMapping("/user/{userId}")
          public GetUserDto getUserDto(@PathVariable("userId") long id){
               return  productService.getUserById(id);
          }


          //http://localhost:8080/address/{{addressId}}
          @GetMapping("/address/{addressId}")
          public GetAddressDto getAddressDto(@PathVariable("addressId") int id){
               return productService.getUserAddress(id);
          }

          //http://localhost:8080/product/{{id}}/{{temp}}
          @GetMapping("/{id}/{temp}")
          public String getProductTemp(@PathVariable("id") Long id, @PathVariable("temp") String temp){
              return "Product Temp Is Ready = " + " Id " + id + " Name = " + temp;
          }

          //->convert the received json to product java object
//          //http://localhost:8080/product
//          @PostMapping("")
//          public String createProducts(@RequestBody Product product){
//              return "Congratulations 🎊🎊🎊 Product created " ;
//          }


//          @GetMapping("")
//          public String check(){
//              return "Status Active 🟢";
//          }



}
