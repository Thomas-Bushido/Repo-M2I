package org.example.dao;

import org.example.dao.BaseDAO;
import org.example.entity.Product_Food;

import java.util.List;

public class Product_FoodDAO extends BaseDAO<Product_Food> {

    public List<Product_Food> getAll (){
        return em.createQuery("Select p from Product p ", Product_Food.class).getResultList();
    }
}