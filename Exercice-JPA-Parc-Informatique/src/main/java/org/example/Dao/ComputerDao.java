package org.example.Dao;

import org.example.entity.Computer;

import java.util.List;

public class ComputerDao extends BaseDao<Computer> {
    public List<Computer> getAll() {
        return em.createQuery("Select c from Computer c", Computer.class);

    }
}
