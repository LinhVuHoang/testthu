package com.example.hello_servlet.controller;

import com.example.hello_servlet.enity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListProductServlet extends HttpServlet {
    public  static ArrayList<Product> list = new ArrayList<>();
    { //static( tĩnh) luôn khởi động khi chạy project tồn tại duy nhất nằm trong ram và ko bị xóa đi , chỉ đc giải phóng khi tắt project
        //Biến tĩnh là biến sẽ được tạo ra duy nhất một lần khi gọi hàm lần đầu tiên và nó sẽ không bị xóa đi để tạo lại khi gọi lại hàm ấy. Đây là sự khác biệt giữa biến tĩnh và biến cục bộ.
        //
        //Biến tĩnh là loại biến lưỡng tính, vừa có tính chất của 1 biến toàn cục, vừa mang tính chất của 1 biến cục bộ:
        //
        //Tính chất 1 biến toàn cục: biến không mất đi khi chương trình con kết thúc, nó vẫn nằm trong ô nhớ của chương trình và được tự động cập nhật khi chương trình con được gọi lại. Giống như 1 biến toàn cục vậy.
        //Tính chất 1 biến cục bộ: biến chỉ có thể được sử dụng trong chương trình con mà nó được khai báo.
        list.add(new Product(1,"iPhone 13 128GB","DS 01","https://cdn.tgdd.vn/Products/Images/42/223602/iphone-13-midnight-2-600x600.jpg",1000,1));
        list.add(new Product(2,"Samsung Galaxy A52s 5G 128GB","DS 02","https://cdn.tgdd.vn/Products/Images/42/247507/samsung-galaxy-a52s-5g-mint-600x600.jpg",1100,1));
        list.add(new Product(3,"iPhone 12 64GB","DS 03","https://cdn.tgdd.vn/Products/Images/42/213031/iphone-12-xanh-la-new-2-600x600.jpg",1200,1));
        list.add(new Product(4,"Samsung Galaxy Z Fold3 5G 256GB","DS 04","https://cdn.tgdd.vn/Products/Images/42/226935/samsung-galaxy-z-fold-3-silver-1-600x600.jpg",1300,1));
        list.add(new Product(5,"iPhone 13 Pro 256GB","DS 05","https://cdn.tgdd.vn/Products/Images/42/250259/iphone-13-pro-gold-1-600x600.jpg",1400,1));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product= new Product();
        product.setId(1);
        product.setName("Sản phẩm 1");
        product.setDescription("Sản phẩm 1");
        product.setThumbnail("Link ảnh");
        product.setPrice(100);
        product.setStatus(1);
        req.setAttribute("list",list); // truyền giá trị có thuộc tính là list giá trị là list
        //có hàm getAttribute nhận giá trị trong đường dẫn có bên dưới
        req.getRequestDispatcher("/admin/product/list.jsp").forward(req,resp);
    }
}
