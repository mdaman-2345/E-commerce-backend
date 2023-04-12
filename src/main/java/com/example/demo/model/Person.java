package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="USER")
@Getter
//@RequiredArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private  String name;
    private  String email;
    private  String password;
    private  String cpassword;


}
