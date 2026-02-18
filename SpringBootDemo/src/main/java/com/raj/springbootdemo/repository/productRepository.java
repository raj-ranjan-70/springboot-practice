package com.raj.springbootdemo.repository;

import com.raj.springbootdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<Product, Integer> {

}
