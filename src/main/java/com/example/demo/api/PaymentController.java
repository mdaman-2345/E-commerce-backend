package com.example.demo.api;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/payments")
    public Payment addPayment(@RequestBody Payment detail){
        return paymentService.savePayment(detail);
    }
}
