package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Data
@Table(name="PAYMENT_DETAIL")
public class Payment {

    @Id
    @GeneratedValue
    private long id;

    private long order_id;
    private String card_no;
    private String time;
    private int price;

}
