package org.example.dao;



import org.example.entity.Product_housing;

import java.util.List;

public class Product_housingDAO extends BaseDAO<Product_housing> {

    public List<Product_housing> getAll (){
        return em.createQuery("Select p from Product p ", Product_housing.class).getResultList();
    }
}