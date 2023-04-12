package com.example.demo.api;
//package com.example.demo.api;

import com.example.demo.dao.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@AllArgsConstructor

public class ProductController {

    private final ProductService productService;

    @PostMapping("product")
    public String addToProductList(@RequestBody ProductDto product){
        return productService.addProduct(product);
    }

    @GetMapping("product")
    public List<Product> allProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("product/{id}")
    public Product findProduct(@PathVariable("id") Long id){
        return productService.selectById(id).orElse(null);
    }




}
