package org.example.dao;

import org.example.entity.Article;
import org.example.util.SessionFactorySingleton;

import java.util.ArrayList;
import java.util.List;


public class ArticleDAO extends BaseDAO<Article> {


        public ArticleDAO() {super(SessionFactorySingleton.getSessionFactory(), Article.class);}


    @Override
    public List<Article> get(){
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select a from Article a", Article.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }



}
