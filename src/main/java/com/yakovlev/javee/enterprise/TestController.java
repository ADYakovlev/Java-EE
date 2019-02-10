package com.yakovlev.javee.enterprise;

/*
@author Yakovlev
*/

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@ManagedBean
@ViewScoped
public class TestController {
    private String name;
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        this.counter++;
    }

    public TestController() {
        this.name = new Date().toString();
        this.counter = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("TEST TEXT");
    }
}
