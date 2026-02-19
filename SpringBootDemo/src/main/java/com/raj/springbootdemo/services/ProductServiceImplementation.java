package com.raj.springbootdemo.services;

import com.raj.springbootdemo.model.Product;
import com.raj.springbootdemo.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private productRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public String deleteProductById(Integer id) {

        Optional<Product> product = productRepository.findById(id);

        if(product.isPresent()) {
            productRepository.deleteById(id);
            return "The Product is deleted successfully";
        }

        return "Something went wrong";
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product oldProduct = productRepository.findById(id).get();

        oldProduct.setProduct_name(product.getProduct_name());
        oldProduct.setDescription(product.getDescription());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setStatus(product.getStatus());

        return productRepository.save(oldProduct);
    }


}
