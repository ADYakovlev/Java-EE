package com.yakovlev.javee.pages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/*
@author Yakovlev
*/
@WebServlet("/generator")
public class GeneratorPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Generator page");
        req.getRequestDispatcher("pages/index.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("title", "Thank you page");
        Map<String, String> docData = new LinkedHashMap<>();
        docData.put("player", req.getParameter("payer"));
        docData.put("recipient", req.getParameter("recipient"));
        docData.put("number", req.getParameter("number"));
        docData.put("date", req.getParameter("date"));
        docData.put("productName", req.getParameter("productName"));
        docData.put("value", req.getParameter("value"));
        docData.put("cost", req.getParameter("cost"));
        docData.put("mail", req.getParameter("mail"));
        req.getRequestDispatcher("pages/thanks.jsp").forward(req,resp);
    }
}
