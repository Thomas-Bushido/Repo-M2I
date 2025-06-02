package org.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBaseManager {

    private static EntityManager entityManager;

    private DataBaseManager(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("production");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static synchronized EntityManager getEntityManager (){
        if(entityManager == null){
            new DataBaseManager();
        }
        return entityManager;
    }
}