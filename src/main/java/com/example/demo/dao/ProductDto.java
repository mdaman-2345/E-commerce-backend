package com.example.demo.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductDto {
    private  String name;
    private  Integer price;
    private  String src;
}
