package com.ag.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date; // Corrected import for date and time

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        pw.println("<h1> Date and Time is: " + new Date() + "</h1>");
        pw.println("<br><a href='index.html'>Home</a>");

        pw.close();
    }
}
