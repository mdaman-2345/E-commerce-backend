package com.example.demo.dao;

import com.example.demo.model.OrderStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStoreDao extends JpaRepository<OrderStore,Long> {
}
