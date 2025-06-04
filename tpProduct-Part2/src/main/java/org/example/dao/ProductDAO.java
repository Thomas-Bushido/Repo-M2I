package org.example.dao;

import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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


    public List<Product> getUpTo(double price){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select p from Product p where p.price > :price ", Product.class);
        query.setParameter("price", price);
        return query.getResultList();
    }

    public List<Product> dateBetween(Date start, Date end){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select p from Product p where p.purchaseDate BETWEEN :start AND :end ", Product.class);
        query.setParameter("start", start);
        query.setParameter("end", end);
        return query.getResultList();
    }
    public List<Product> stockUnderValue(int stockValue){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select p from Product p where p.stock < :stockValue", Product.class);
        query.setParameter("stockValue", stockValue);
        return query.getResultList();
    }
    public List<Product> stockBrand(String brand){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select p.stock from Product p where p.brand = :brand", Product.class);
        query.setParameter("brand", brand);
        return query.getResultList();
    }
    public List<Product> avgPrice(){
        session = sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("select avg(p.price) from Product p", Product.class);

        return query.getResultList();
    }
}
