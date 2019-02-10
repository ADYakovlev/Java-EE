package com.yakovlev.javee.enterprise;

/*
@author Yakovlev
*/

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean (name="gen")
@ViewScoped
public class GenController {
    private String pageName;
    private int number;

    public GenController() {
        this.pageName = "Main page";
        this.number = 10;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
