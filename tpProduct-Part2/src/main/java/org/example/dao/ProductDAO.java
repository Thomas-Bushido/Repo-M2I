package org.example.dao;

import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends BaseDAO<Product> {

    public ProductDAO() {
        super(SessionFactorySingleton.getSessionFactory(), Product.class);
    }

    @Override
    public List<Product> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select p from Product p", Product.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Product> getUpTo100(){
        session = sessionFactory.openSession();
        return session.createQuery("select p from Product p where p.price > 100 ", Product.class).getResultList();
    }

    public List<Product> dateBetween(){
        session = sessionFactory.openSession();
        return session.createQuery("select p from Product p where p.purchaseDate BETWEEN 2025-06-02 AND 2025-06-04 ", Product.class).getResultList();
    }
}
