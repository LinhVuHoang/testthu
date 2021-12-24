package com.example.hello_servlet.controller;

import com.example.hello_servlet.enity.Food;
import com.example.hello_servlet.enity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListFoodServlet extends HttpServlet {
    public static ArrayList<Food> list = new ArrayList<>();
    {
    list.add(new Food(1,"GÀ NUGGEST","https://burgerking.vn/media/catalog/product/cache/1/small_image/316x/9df78eab33525d08d6e5fb8d27136e95/g/_/g_nuggets_chicken_nuggets__2.jpg","Món 1",26000,"Đã bán"));
        list.add(new Food(2,"BUGER BÒ NƯỚNG WHOPPER","https://burgerking.vn/media/catalog/product/cache/1/small_image/316x/9df78eab33525d08d6e5fb8d27136e95/b/o/bo_nuong_whopper_alc__1.jpg","Món 2",11500,"chưa bán"));
        list.add(new Food(3,"BUGER BÒ PHÔ MAI","https://burgerking.vn/media/catalog/product/cache/1/small_image/316x/9df78eab33525d08d6e5fb8d27136e95/c/h/cheese-bg_2.jpg","Món 3",49000,"Đã bán"));
        list.add(new Food(4,"BUGER BÒ NƯỚNG HÀNH CHIÊN","https://burgerking.vn/media/catalog/product/cache/1/small_image/316x/9df78eab33525d08d6e5fb8d27136e95/g/r/grilled_onion_alc__1.jpg","Món 4",51000,"bán hết"));
        list.add(new Food(5,"BUGER PHÔ MAI GÀ","https://burgerking.vn/media/catalog/product/cache/1/small_image/316x/9df78eab33525d08d6e5fb8d27136e95/c/n/cnc_1.jpg","Món 5",49000,"chưa bán"));
        }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list",list);
        req.getRequestDispatcher("/admin/Food/list.jsp").forward(req,resp);

    }

}
