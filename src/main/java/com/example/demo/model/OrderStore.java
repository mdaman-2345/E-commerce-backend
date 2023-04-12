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
@Table(name="PRODUCT_DETAIL")

public class OrderStore {
    @Id
    @GeneratedValue
    private long id;
    private long order_id;
    private long user_id;

    private int product_id;
    private int product_count;
}
