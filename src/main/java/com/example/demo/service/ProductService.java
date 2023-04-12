package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.dao.ProductDto;
import com.example.demo.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDao productDao;

    public String addProduct(ProductDto product) {
        return fieldMapper(product);
    }

    public List<Product> getAllProduct(){
        return productDao.findAll();
    }
    public Optional<Product> selectById(Long id){
        return productDao.findById(id);
    }

    private String fieldMapper(ProductDto product){
        Product p1=new Product();
        p1.setName(product.getName());
        p1.setSrc(product.getSrc());
        p1.setPrice(product.getPrice());
        productDao.save(p1);
        return "Saved successfully";
    }

}
