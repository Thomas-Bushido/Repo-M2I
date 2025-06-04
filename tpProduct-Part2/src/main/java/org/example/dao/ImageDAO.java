package org.example.dao;

import org.example.entity.Image;
import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;

import java.util.ArrayList;
import java.util.List;

public class ImageDAO extends BaseDAO<Image> {

    public ImageDAO() {
        super(SessionFactorySingleton.getSessionFactory(), Image.class);
    }
    @Override
    public List<Image> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select i from Comment i", Image.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }
}