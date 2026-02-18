package com.raj.springbootdemo.services;

import com.raj.springbootdemo.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);
}
