package com.raj.springbootdemo.services;

import com.raj.springbootdemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface productService {

    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);
}
