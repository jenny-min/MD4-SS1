package com.example.product_management.controller;

import com.example.product_management.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.product_management.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired //tiêm ProductService vào Controller
    private ProductService  productService;

    //Lấy danh sách bằng GET
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //Thêm mới
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    //Cập nhật
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id,
                                 @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }
    //Xóa
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        boolean isDeleted = productService.deleteProduct(id);
        if (isDeleted) {
            return "Xóa thành công" + id;
        } else  {
            return "Không tìm thấy sản phẩm";
        }
    }
}
