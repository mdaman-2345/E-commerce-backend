package com.example.demo.api;

import com.example.demo.model.OrderStore;
import com.example.demo.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/order")
    public List<OrderStore> addOrder(@RequestBody List<OrderStore> Products){
        return orderService.saveProduct(Products);
    }

}
