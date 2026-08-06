package com.H2_Connection.React_Spring.Boot.repo;

import com.H2_Connection.React_Spring.Boot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    

}
