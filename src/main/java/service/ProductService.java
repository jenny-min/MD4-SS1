package service;

import model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> p = new ArrayList<>();

    //Tạo dữ liệu giả
    public ProductService() {
        p.add(new Product(1, "iPhone17", 200));
        p.add(new Product(2, "MacBook Air", 450));
        p.add(new Product(3, "iPod Gen 3", 40));
    }

    //Lấy danh sách sản phẩm
    public List<Product> getAllProducts() {
        return p;
    }
}
