package com.yakovlev.javee.pages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
@author Yakovlev
*/
@WebServlet("/catalog")
public class CatalogPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println(Teamplate.HEADER_BEFORE_TITLE+"Catalog"+Teamplate.HEADER_AFTER_TITLE);
            out.println("<h1>- Catalog page -</h1>");
            out.println(Teamplate.MENUE);
            out.println(Teamplate.FOOTER);
        }
    }
}