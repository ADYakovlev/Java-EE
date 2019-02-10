package com.yakovlev.javee.enterprise;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
@author Yakovlev
*/
@ManagedBean(name = "list", eager=true)
@RequestScoped
@ViewScoped
public class ProductList implements Serializable {
    private List<Product> products;
    public ProductList(){
        products = new ArrayList<Product>();
        products.add(new Product("One",100));
        products.add(new Product("Two",120));
        products.add(new Product("Three",150));
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void test(){
        System.out.println("HELLO");
    }
}