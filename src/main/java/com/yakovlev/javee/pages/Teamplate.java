package com.yakovlev.javee.pages;

/*
@author Yakovlev
*/
public class Teamplate {
    public static final String HEADER_BEFORE_TITLE = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\"><title>";
    public static final String HEADER_AFTER_TITLE = "</title>\n</head>\n<body>";
    public static final String FOOTER = "</body>\n</html>";
    public static final String MENUE = "<ui>\n<li><a href=\"main\">Main</a></li>\n<li><a href=\"catalog\">Catalog</a></li>\n<li><a href=\"product\">Product</a></li>\n<li><a href=\"cart\">Cart</a></li>\n<li><a href=\"order\">Order</a></li>\n</ui>";
    private Teamplate() {}
}
