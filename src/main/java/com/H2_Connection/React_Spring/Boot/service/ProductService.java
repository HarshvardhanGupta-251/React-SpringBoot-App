package com.H2_Connection.React_Spring.Boot.service;

import org.springframework.stereotype.Service;
import com.H2_Connection.React_Spring.Boot.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

}
