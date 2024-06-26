package com.example.totalitea.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "basket")
public class BasketData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "supplier")
    private String supplier;

    @Column(name= "type")
    private String type;

    @Column(name = "grams", nullable = false)
    private Long grams;

    @Column(name = "price")
    private float price;

}
