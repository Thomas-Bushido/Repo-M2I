package org.example.Dao;

import javax.persistence.EntityManager;
// T est un type générique
public abstract class BaseDao<T> {
    protected EntityManager em;

    public T save (T element){
        em.getTransaction().begin();
        em.persist(element);
        em.getTransaction().commit();
        return element;
    }



    public T getById(int id, Class<T> tClass){
        return em.find(tClass, id);
    }
    public T update (T element) {
        try {
            em.getTransaction().begin();
            em.merge(element);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return element;
    }
    public boolean delete (int id, Class<T> tClass){
        T elementFound = getById(id,tClass);
        em.getTransaction().begin();
        em.remove(elementFound);
        em.getTransaction().commit();
        return true;
    }
}
