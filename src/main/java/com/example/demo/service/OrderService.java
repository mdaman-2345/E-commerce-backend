package com.example.demo.service;

import com.example.demo.dao.OrderStoreDao;
import com.example.demo.model.OrderStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

   private final OrderStoreDao orderStoreDao;


   public List<OrderStore> saveProduct(List<OrderStore> Products){
      return orderStoreDao.saveAll(Products);
   }




}
