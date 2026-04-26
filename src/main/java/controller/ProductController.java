package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

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
}
