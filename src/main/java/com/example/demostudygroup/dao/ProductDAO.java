package com.example.demostudygroup.dao;
import java.util.*;
import com.example.demostudygroup.model.*;
public class ProductDAO {
    public Product find(){
        return new  Product("id1","Mlu1","name1.png", new Date());
    }

    public List<Product> findAll(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("id1","name1","name1.jpg", new Date()));
        products.add(new Product("id2","name2","name2.jpg", new Date()));
        products.add(new Product("id3","name3","name3.jpg", new Date()));
        products.add(new Product("id4","name4","name4.jpg", new Date()));

        return products;
    }
}
