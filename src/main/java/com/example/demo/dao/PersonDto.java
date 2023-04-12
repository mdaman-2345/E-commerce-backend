package com.example.demo.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonDto {
    private  String name;
    private  String email;
    private  String password;
    private  String cpassword;
}
