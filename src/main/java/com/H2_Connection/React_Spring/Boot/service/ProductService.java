package com.H2_Connection.React_Spring.Boot.service;

import com.H2_Connection.React_Spring.Boot.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.H2_Connection.React_Spring.Boot.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {

        return productRepo.findAll();
    }

}
