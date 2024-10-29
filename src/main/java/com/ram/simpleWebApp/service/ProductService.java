package com.ram.simpleWebApp.service;

import java.util.Arrays;
import java.util.List;

import com.ram.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(1,"Iphone", 45000), new Product(2,"Laptop",25000));

    public List<Product> getProducts(){
    return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
}
