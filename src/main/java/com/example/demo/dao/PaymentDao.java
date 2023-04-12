package com.example.demo.dao;

import com.example.demo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Long> {
}
