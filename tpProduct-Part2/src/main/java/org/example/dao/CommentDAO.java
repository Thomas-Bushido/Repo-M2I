package org.example.dao;

import org.example.entity.Comment;
import org.example.entity.Product;
import org.example.util.SessionFactorySingleton;

import java.util.ArrayList;
import java.util.List;

public class CommentDAO extends BaseDAO<Comment> {

    public CommentDAO() {
        super(SessionFactorySingleton.getSessionFactory(), Comment.class);
    }
    @Override
    public List<Comment> get() {
        try{
            session = sessionFactory.openSession();
            return session.createQuery("select c from Comment c", Comment.class).getResultList();
        }catch (Exception ex){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }
}