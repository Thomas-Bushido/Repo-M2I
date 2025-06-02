package org.example.Dao;

import org.example.entity.Processor;
import org.example.entity.Project;

import java.util.List;

public class ProjectDao extends BaseDao<Project> {


    public List<Processor> getAll(){
        return em.createQuery("select p from Processor p", Processor.class).getResultList();
    }
}