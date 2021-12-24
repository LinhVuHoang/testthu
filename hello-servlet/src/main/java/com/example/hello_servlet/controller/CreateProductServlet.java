package com.example.hello_servlet.controller;

import com.example.hello_servlet.enity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        resp.setContentType("text/html");
////        resp.getWriter().println("<html>");
////        resp.getWriter().println("<head>");
////        resp.getWriter().println("<title>Hello world</title>");
////        resp.getWriter().println("<style>h1 {color:red}</style>");
////        resp.getWriter().println("</head>");
////        resp.getWriter().println("<body>");
////        resp.getWriter().println("<h1>Hello T2004E</h1>");
////        resp.getWriter().println("</body>");
////        resp.getWriter().println("</html>");
        req.getRequestDispatcher("/admin/product/form.jsp").forward(req,resp);
        //lấy giao diện
        //jsp hỗ trợ html và java
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/admin/product/form.jsp").forward(req,resp);

        //dữ liệu đc xử lý trong doPost
        try {
            int id =Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            double price =Double.parseDouble(req.getParameter("price"));
            String description = req.getParameter("description");
            String thumbnail = req.getParameter("thumbnail");
            int status =Integer.parseInt(req.getParameter("status"));
            Product product = new Product(id,name,description,thumbnail,price,status);
            ListProductServlet.list.add(product);
            resp.sendRedirect("/admin/product/list");
            //lấy dữ liệu từ form gửi lên thông qua các name
        }catch (Exception ex){
            resp.getWriter().println("Bad request");
        }


    }
}
