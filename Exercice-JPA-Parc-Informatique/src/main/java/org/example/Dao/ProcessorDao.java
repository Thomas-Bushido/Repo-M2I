package org.example.Dao;

import org.example.entity.Processor;

import java.util.List;

public class ProcessorDao extends BaseDao<Processor> {


    public List<Processor> getAll(){
        return em.createQuery("select p from Processor p", Processor.class).getResultList();
    }
}
