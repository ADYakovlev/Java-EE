package com.yakovlev.javee.enterprise;

import java.io.Serializable;

/*
@author Yakovlev
*/
public class Product {
    private int price;
    private String name;

    public Product(){
        this.price = 100;
        this.name = "Alex";
    }

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
