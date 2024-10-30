package com.ram.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ram.simpleWebApp.model.Product;
import com.ram.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    //List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Iphone", 45000), new Product(2,"Laptop",25000)));

    public List<Product> getProducts(){
    return repo.findAll();
            //products;
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
//                products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().get();
    }

    public void addProduct(Product prod){
        repo.save(prod);
//        products.add(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
//        int index =0;
//        for (int i=0; i <products.size();i++){
//            if (products.get(i).getProdId() == prod.getProdId())
//                    index=i;
//        }
//
//        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
//        int index =0;
//        for (int i=0; i <products.size();i++){
//            if (products.get(i).getProdId() == prodId)
//                index=i;
//        }
//        products.remove(index);
    }
}
