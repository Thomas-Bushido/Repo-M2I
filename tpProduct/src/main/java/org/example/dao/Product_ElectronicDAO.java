package org.example.dao;


import org.example.entity.Product_Electronic;

import java.util.List;

public class Product_ElectronicDAO extends BaseDAO<Product_Electronic> {

    public List<Product_Electronic> getAll (){
        return em.createQuery("Select p from Product p ", Product_Electronic.class).getResultList();


    }
}
