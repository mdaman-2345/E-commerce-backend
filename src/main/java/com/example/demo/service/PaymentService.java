package com.example.demo.service;

import com.example.demo.dao.PaymentDao;
import com.example.demo.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentDao paymentDao;
    public Payment savePayment(Payment detail){
        return paymentDao.save(detail);
    }
}
