package com.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "product_discount_calculator", value = "/product_discount_calculator")
public class Product_Discount_Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     float ListPrice = Float.parseFloat(req.getParameter("price"));
     float DiscountPercent = Float.parseFloat(req.getParameter("percent"));

     float DiscountAmount = (float) (ListPrice* DiscountPercent*0.01);
     float DiscountPrice = ListPrice - DiscountAmount;

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Discount Amount: "+ DiscountAmount +"</h1>");
        writer.println("<h1> Discount Price: "+ DiscountPrice + "</h1>");
        writer.println("</html>");

    }
}
