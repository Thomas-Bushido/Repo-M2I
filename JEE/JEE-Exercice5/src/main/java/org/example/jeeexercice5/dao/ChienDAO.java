package org.example.jeeexercice5.dao;

import jakarta.persistence.TypedQuery;
import org.example.jeeexercice5.controller.Chien;
import org.example.jeeexercice5.util.HibernateSession;
import org.example.jeeexercice5.util.SessionFactorySingleton;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ChienDAO extends BaseDAO<Chien> {

    public ChienDAO()  {
        super(HibernateSession.getSessionFactory(), Chien.class);
    }
    @Override
    public List<Chien> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select p from Chien p", Chien.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<Chien> getDogByName (String name){
        try{
            session = sessionFactory.openSession();
            TypedQuery<Chien> query = session.createQuery("select c from Chien c where c.name >= :name", Chien.class);
            query.setParameter("name",name);
            return query.getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }


}





