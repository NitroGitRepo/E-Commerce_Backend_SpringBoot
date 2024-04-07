package org.ecommerce.productservice.controller;

import org.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

         @GetMapping("")
         public String check(){
             return "Product Service Is Running";
         }

         //http://localhost:8083/product/{{id}}
         @GetMapping("/{id}")
         public String getProductById(@PathVariable("id") long id){
              return "🛒 Product Id = " + id;
         }


         //http://localhost:8083/product/{{id}}/{{productName}}
         @GetMapping("/{id}/{productName}")
         public String getProductById(@PathVariable long id, @PathVariable String productName){
             return "☑️ Product Details = " +id + "  " + productName;
         }


         @PostMapping("")
         public  String getProduct(@RequestBody Product product){
             return "🔴Product Details\n" +
                     "🪪Product Id = " + product.getId() + "\n" +
                     "🚀Product Name = " + product.getName() + "\n" +
                     "💶Product Price = " + product.getPrice() + "\n" +
                     "📝Product Description = " + product.getDescription();
         }
}
