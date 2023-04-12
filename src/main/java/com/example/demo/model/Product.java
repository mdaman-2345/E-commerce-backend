package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="PRODUCT")
@Getter
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private  String name;
    private  Integer price;
    private  String src;



}
