package com.yakovlev.javee.pages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
@author Yakovlev
*/
@WebServlet("/test")
public class TestPageServlet extends HttpServlet {

    List<String> list = new ArrayList<>();
    List<String> initList(){
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        return list;
    }
    List<String> addToList(String s){
        list.add(s);
        return list;
    }

    List<String> remFromList(){
        if(list.size()>=1)list.remove(list.size()-1);
        return list;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title","Test");
        req.setAttribute("coll", initList());
        req.getRequestDispatcher("pages/test.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title","Test");
        if(req.getParameter("btn").equals("add"))addToList(req.getParameter("name"));
        if(req.getParameter("btn").equals("rem"))remFromList();
        req.setAttribute("coll", list);
        req.getRequestDispatcher("pages/test.jsp").forward(req,resp);
    }
}
